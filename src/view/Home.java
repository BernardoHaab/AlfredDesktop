/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.util.StarRater;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelDominio.Empresa;
import modelDominio.Pedido;
import modelDominio.Prato;
import view.tablemodel.PedidoTableModel;
import view.tablemodel.PratosTableModel;
import view.util.Imagem;

/**
 *
 * @author be_ha
 */
public class Home extends javax.swing.JFrame {
    
    private PratosTableModel pratoModel;
    private PedidoTableModel PedidosAnaliseModel;
    private PedidoTableModel PedidosAprovadosModel;
    private PedidoTableModel PedidosReprovadosModel;
    private StarRater starRater;
    
    public Home() {
        initComponents();        
        Dimension dimensoes = Toolkit.getDefaultToolkit().getScreenSize();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        jPanel1.setPreferredSize(new Dimension((int)dimensoes.getWidth(),(int)dimensoes.getHeight()+150));
//        jScrollPane5.setPreferredSize(new Dimension((int)dimensoes.getWidth(),(int)dimensoes.getHeight()+150));
        jScrollPane5.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
//        scrollPane.setFitToWidth(true);
        jBtnAddPrato.requestFocus();
        jCbxRestauranteStatus.setSelected(AlfredCliente.ccont.empresa.getAbertoFechadoEmpresa());
        this.atualizaTabelaPratos();
        this.atualizaTabelaPedidosAnalise();
        this.atualizaTabelaPedidosAprovados();
        this.atualizaTabelaPedidosReprovados();
        this.starRater = new StarRater(5, AlfredCliente.ccont.empresa.getAvaliacaoEmpresa().getNotaAvaliacao());
        jPnlAvaliacao.add(starRater);
        jPnlAvaliacao.revalidate();
        jPnlAvaliacao.repaint();
        this.atualizarDados();
    }
    
    private void atualizarDados() {
        Imagem imagem = null;
        if (AlfredCliente.ccont.empresa.getImagemEmpresa() != null) {
            imagem = new Imagem(AlfredCliente.ccont.empresa.getImagemEmpresa(), 60, 60);
        } else {
            imagem = new Imagem(new File(new File("").getAbsolutePath() + "\\src\\view\\imagens\\logo_PB.jpg"), 60, 60);
        }
        jLblImagem.setIcon(imagem.getImageIconRounded());
        jLblCategoria.setText(AlfredCliente.ccont.empresa.getCategoriaEmpresa().getNomeCategoria());
        jLblNome.setText(AlfredCliente.ccont.empresa.getNomeEmpresa());
        jLblPrecoMedio.setText(AlfredCliente.ccont.empresa.getPrecoMedioString());
//        this.starRater.setRating(AlfredCliente.ccont.empresa.getAvaliacaoEmpresa().getNotaAvaliacao());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCbxRestauranteStatus = new javax.swing.JCheckBox();
        jBtnAddPrato = new javax.swing.JButton();
        jBtnEditarPerfil = new javax.swing.JButton();
        jBtnAvaliacoes = new javax.swing.JButton();
        jPanelPedidos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblAnalise = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblAceitos = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTblRecusados = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanelPratos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblPratos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLblImagem = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jPnlAvaliacao = new javax.swing.JPanel();
        jLblPrecoMedio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLblCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane5.setBorder(null);
        jScrollPane5.setViewportView(jPanel1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 26)); // NOI18N
        jLabel1.setText("Restaurante Aberto");

        jCbxRestauranteStatus.setBackground(new java.awt.Color(255, 255, 255));
        jCbxRestauranteStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCbxRestauranteStatus.setBorder(null);
        jCbxRestauranteStatus.setBorderPainted(true);
        jCbxRestauranteStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCbxRestauranteStatusMouseClicked(evt);
            }
        });
        jCbxRestauranteStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxRestauranteStatusActionPerformed(evt);
            }
        });

        jBtnAddPrato.setBackground(new java.awt.Color(150, 150, 150));
        jBtnAddPrato.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnAddPrato.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddPrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_add.png"))); // NOI18N
        jBtnAddPrato.setText("Adiconar Prato");
        jBtnAddPrato.setToolTipText("");
        jBtnAddPrato.setBorder(null);
        jBtnAddPrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddPratoActionPerformed(evt);
            }
        });

        jBtnEditarPerfil.setBackground(new java.awt.Color(150, 150, 150));
        jBtnEditarPerfil.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_user_white.png"))); // NOI18N
        jBtnEditarPerfil.setText("Editar Perfil");
        jBtnEditarPerfil.setToolTipText("");
        jBtnEditarPerfil.setBorder(null);
        jBtnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarPerfilActionPerformed(evt);
            }
        });

        jBtnAvaliacoes.setBackground(new java.awt.Color(150, 150, 150));
        jBtnAvaliacoes.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnAvaliacoes.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAvaliacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_add.png"))); // NOI18N
        jBtnAvaliacoes.setText("Visualizar Avalia????es");
        jBtnAvaliacoes.setToolTipText("");
        jBtnAvaliacoes.setBorder(null);
        jBtnAvaliacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAvaliacoesActionPerformed(evt);
            }
        });

        jPanelPedidos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 30)); // NOI18N
        jLabel4.setText("Pedidos Pendentes");

        jTblAnalise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTblAnalise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblAnaliseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTblAnalise);

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 30)); // NOI18N
        jLabel5.setText("Pedidos Aceitos");

        jTblAceitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTblAceitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblAceitosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTblAceitos);

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 30)); // NOI18N
        jLabel6.setText("Pedidos Recusados");

        jTblRecusados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTblRecusados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblRecusadosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTblRecusados);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/reload.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPedidosLayout = new javax.swing.GroupLayout(jPanelPedidos);
        jPanelPedidos.setLayout(jPanelPedidosLayout);
        jPanelPedidosLayout.setHorizontalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(jPanelPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4))
                .addGap(0, 0, 0))
            .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPedidosLayout.createSequentialGroup()
                    .addGap(714, 714, 714)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelPedidosLayout.setVerticalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidosLayout.createSequentialGroup()
                .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPedidosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPedidosLayout.createSequentialGroup()
                    .addGap(259, 259, 259)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(521, Short.MAX_VALUE)))
        );

        jPanelPratos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 30)); // NOI18N
        jLabel2.setText("Pratos dispon??veis");

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_lupa.png"))); // NOI18N

        jTxtPesquisa.setBackground(jPanel2.getBackground());
        jTxtPesquisa.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jTxtPesquisa.setForeground(new java.awt.Color(199, 199, 199));
        jTxtPesquisa.setText("Pesquisar prato");
        jTxtPesquisa.setBorder(null);
        jTxtPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtPesquisaFocusLost(evt);
            }
        });
        jTxtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPesquisaActionPerformed(evt);
            }
        });
        jTxtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTxtPesquisa)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15))
        );

        jTblPratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTblPratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblPratosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblPratos);

        javax.swing.GroupLayout jPanelPratosLayout = new javax.swing.GroupLayout(jPanelPratos);
        jPanelPratos.setLayout(jPanelPratosLayout);
        jPanelPratosLayout.setHorizontalGroup(
            jPanelPratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPratosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelPratosLayout.setVerticalGroup(
            jPanelPratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPratosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLblImagem.setBackground(new java.awt.Color(255, 255, 255));

        jLblNome.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLblNome.setText("Nome Restaurante");

        jPnlAvaliacao.setBackground(new java.awt.Color(255, 255, 255));

        jLblPrecoMedio.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLblPrecoMedio.setText("32,00");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setText("R$");

        jLblCategoria.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLblCategoria.setText("Pizza");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLblNome)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPnlAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(jLblPrecoMedio)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLblCategoria)
                        .addComponent(jLabel8)
                        .addComponent(jLblPrecoMedio))
                    .addComponent(jPnlAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAddPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jBtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jBtnAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelPratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(jPanelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(jCbxRestauranteStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCbxRestauranteStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jScrollPane5.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizaTabelaPratos() {
        String pesquisa = "";
        if (!jTxtPesquisa.getText().trim().equals("Pesquisar prato") && !jTxtPesquisa.getText().trim().equals("")) {
            pesquisa = jTxtPesquisa.getText();
        }
        ArrayList<Prato> listaPrato = AlfredCliente.ccont.pratoListaEmpresaNome(AlfredCliente.ccont.empresa.getCodEmpresa(), pesquisa);
        pratoModel = new PratosTableModel(listaPrato);
        jTblPratos.setModel(pratoModel);
    }
    
    private void atualizaTabelaPedidosAnalise() {
        ArrayList<Pedido> listaPedido = AlfredCliente.ccont.listaPedidosAnalise();
        PedidosAnaliseModel = new PedidoTableModel(listaPedido);
        jTblAnalise.setModel(PedidosAnaliseModel);
    }
    
    private void atualizaTabelaPedidosAprovados() {
        ArrayList<Pedido> listaPedido = AlfredCliente.ccont.listaPedidosAprovados();
        PedidosAprovadosModel = new PedidoTableModel(listaPedido);
        jTblAceitos.setModel(PedidosAprovadosModel);
    }
    
    
    private void atualizaTabelaPedidosReprovados() {
        ArrayList<Pedido> listaPedido = AlfredCliente.ccont.listaPedidosReprovados();
        PedidosReprovadosModel = new PedidoTableModel(listaPedido);
        jTblRecusados.setModel(PedidosReprovadosModel);
    }
    
    private void jTxtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPesquisaActionPerformed

    private void jBtnAvaliacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAvaliacoesActionPerformed
        ListaAvaliacoes listaAvl = new ListaAvaliacoes(this, true);
        listaAvl.setVisible(true);
    }//GEN-LAST:event_jBtnAvaliacoesActionPerformed

    private void jBtnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarPerfilActionPerformed
        FormPerfil formPerfil = new FormPerfil(this, true);
        formPerfil.setVisible(true);
        this.atualizarDados();
    }//GEN-LAST:event_jBtnEditarPerfilActionPerformed

    private void jCbxRestauranteStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxRestauranteStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxRestauranteStatusActionPerformed

    private void jTxtPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtPesquisaFocusGained
        if (jTxtPesquisa.getText().trim().equals("Pesquisar prato")) {
            jTxtPesquisa.setText("");
            jTxtPesquisa.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtPesquisaFocusGained

    private void jTxtPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtPesquisaFocusLost
        if (jTxtPesquisa.getText().trim().equals("")) {
            jTxtPesquisa.setText("Pesquisar prato");
            jTxtPesquisa.setForeground(new Color(199,199,199));
        }
    }//GEN-LAST:event_jTxtPesquisaFocusLost

    private void jBtnAddPratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddPratoActionPerformed
        FormPrato formPrato = new FormPrato(this, true);
        formPrato.setVisible(true);
        this.atualizaTabelaPratos();
        this.atualizarDados();
    }//GEN-LAST:event_jBtnAddPratoActionPerformed

    private void jCbxRestauranteStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbxRestauranteStatusMouseClicked
        if (AlfredCliente.ccont.empresa.getCategoriaEmpresa().getCodCategoria() > 0) {
            Empresa emp = new Empresa(AlfredCliente.ccont.empresa.getCodEmpresa(), jCbxRestauranteStatus.isSelected());
            String ok = AlfredCliente.ccont.abrirFecharempresa(emp);
            if (ok.equals("ok")) {
                AlfredCliente.ccont.empresa.setAbertoFechadoEmpresa(emp.getAbertoFechadoEmpresa());
                if (jCbxRestauranteStatus.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Restaurante aberto com sucesso", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Restaurante fechado com sucesso", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao abrir restaurante!", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Voc?? deve completar o cadastro antes de abrir o restaurante!", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            jCbxRestauranteStatus.setSelected(false);
        }
    }//GEN-LAST:event_jCbxRestauranteStatusMouseClicked

    private void jTblPratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblPratosMouseClicked
        FormPrato formPrato = new FormPrato(this, true, pratoModel.getPrato(jTblPratos.getSelectedRow()));
        formPrato.setVisible(true);
        this.atualizaTabelaPratos();
    }//GEN-LAST:event_jTblPratosMouseClicked

    private void jTxtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPesquisaKeyPressed
        this.atualizaTabelaPratos();
    }//GEN-LAST:event_jTxtPesquisaKeyPressed

    private void jTblAnaliseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblAnaliseMouseClicked
        FormPedidos formPedidos = new FormPedidos(this, true, PedidosAnaliseModel.getPedido(jTblAnalise.getSelectedRow()));
        formPedidos.setVisible(true);
        this.atualizaTabelaPedidosAnalise();
        this.atualizaTabelaPedidosAprovados();
        this.atualizaTabelaPedidosReprovados();
    }//GEN-LAST:event_jTblAnaliseMouseClicked

    private void jTblAceitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblAceitosMouseClicked
        FormPedidos formPedidos = new FormPedidos(this, true, PedidosAprovadosModel.getPedido(jTblAceitos.getSelectedRow()));
        formPedidos.setVisible(true);
    }//GEN-LAST:event_jTblAceitosMouseClicked

    private void jTblRecusadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblRecusadosMouseClicked
        FormPedidos formPedidos = new FormPedidos(this, true, PedidosReprovadosModel.getPedido(jTblRecusados.getSelectedRow()));
        formPedidos.setVisible(true);
    }//GEN-LAST:event_jTblRecusadosMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.out.println("aaaaa testeeee");
        this.atualizaTabelaPedidosAnalise();
    }//GEN-LAST:event_jLabel7MouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbusaa look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBtnAddPrato;
    private javax.swing.JButton jBtnAvaliacoes;
    private javax.swing.JButton jBtnEditarPerfil;
    private javax.swing.JCheckBox jCbxRestauranteStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblCategoria;
    private javax.swing.JLabel jLblImagem;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblPrecoMedio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPedidos;
    private javax.swing.JPanel jPanelPratos;
    private javax.swing.JPanel jPnlAvaliacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTblAceitos;
    private javax.swing.JTable jTblAnalise;
    private javax.swing.JTable jTblPratos;
    private javax.swing.JTable jTblRecusados;
    private javax.swing.JTextField jTxtPesquisa;
    // End of variables declaration//GEN-END:variables
}
