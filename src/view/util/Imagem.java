/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author herrmann
 */
public class Imagem {
    // Forcei um aspect ratio de 16:9 e tamanho máximo de 150x84
    // Se vierem imagens com tamanho ou aspect ratio diferentes o método 
    // getImageIcon corrige e adequa para 16:9
    private static int LARGURA = 240;
    private static int ALTURA = 240;
    
    private byte[] imagem;

    public byte[] getImagem() {
        return imagem;
    }

    public Imagem(byte[] imagem) {
        this.imagem = imagem;
        this.LARGURA = 240;
        this.ALTURA = 240;
    }
        
    public Imagem(byte[] imagem, int largura, int altura) {
        this.imagem = imagem;
        this.LARGURA = largura;
        this.ALTURA = altura;
    }
    
     public Imagem(File file, int largura, int altura) {
        this.imagem = ImageToByte(file);
        this.LARGURA = largura;
        this.ALTURA = altura;
    }
    
    public Imagem(File file) {
        this.imagem = ImageToByte(file);
        this.LARGURA = 240;
        this.ALTURA = 240;
    }
    
    
    private byte[] ImageToByte(File file) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] buf = new byte[1024];
            try {
                //System.out.println(bos.size());
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                    //System.out.println("read " + readNum + " bytes,");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        byte[] bytes = bos.toByteArray();

        return bytes;
    }
    
    private ImageIcon ScaleImage(Dimension medida, BufferedImage bimg) {
        return new ImageIcon(new ImageIcon(bimg).getImage().getScaledInstance(medida.width, medida.height, java.awt.Image.SCALE_SMOOTH));
    }
    
    private ImageIcon ScaleImage(Dimension medida) {
        return ScaleImage(medida, getBufferdImage());
    }

    private BufferedImage getBufferdImage() {
        try {
            return ImageIO.read(new ByteArrayInputStream(imagem));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private Dimension getImageDimension(BufferedImage bimg) {
        // calculando aspect ratio
        float imageAspect = (float) bimg.getWidth() / (float) bimg.getHeight();
        float canvasAspect = (float) LARGURA / (float) ALTURA;

        int imgWidth = LARGURA;
        int imgHeight = ALTURA;
        if (imageAspect < canvasAspect) {
            // Se o aspect ratio da imagem for menor que o da tela então altera a largura
            float w = (float) ALTURA * imageAspect;
            imgWidth = (int) w;
        } else {
            // senão altera a altura
            float h = (float) LARGURA / imageAspect;
            imgHeight = (int) h;
        }
        return new Dimension(imgWidth, imgHeight);
    }
    
    public ImageIcon getImageIcon() {
        BufferedImage bimg = getBufferdImage();

        if (bimg != null) {
            Dimension dimensao = getImageDimension(bimg);
            return ScaleImage(dimensao);
        } else {
            System.out.println("Erro ao transformar imagem em BufferdImage");
            return null;
        }
        
    }
    
    public ImageIcon getImageIconRounded() {
        BufferedImage bimg = getBufferdImage();
        if (bimg != null) {
            int larguraOriginal = bimg.getWidth();
            int alturaOriginal = bimg.getHeight();
            
            Dimension dimensao = getImageDimension(bimg);
            
            BufferedImage output = new BufferedImage(larguraOriginal, alturaOriginal, BufferedImage.TYPE_INT_ARGB);
            
            Graphics2D g2 = output.createGraphics();

            g2.setComposite(AlphaComposite.Src);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(Color.WHITE);
            g2.fill(new RoundRectangle2D.Float(0, 0, larguraOriginal, alturaOriginal, larguraOriginal, alturaOriginal));

            g2.setComposite(AlphaComposite.SrcAtop);
            g2.drawImage(bimg, 0, 0, null);

            g2.dispose();
//            return new ImageIcon(new ImageIcon(output).getImage().getScaledInstance(larguraNova, alturaNova, java.awt.Image.SCALE_SMOOTH));
            return ScaleImage(dimensao, output);
        } else {            
            System.out.println("Erro ao transformar imagem em BufferdImage");
            return null;
        }
        
    }
}
