/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author be_ha
 */
public class FormCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar
     */
    public FormCadastrar() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jPanel1.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        String caminhoBase = new File("").getAbsolutePath();
        ImageIcon image = new ImageIcon(caminhoBase + "\\src\\view\\imagens\\teste_esquerda.jpg");
        jLblImagem.setIcon(image);
        jBtnCadastrar.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblImagem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelNome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jTxtNome = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jPanelCNPJ = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jTxtCnpj = new javax.swing.JTextField();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jPanelEmail = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jTxtEmail = new javax.swing.JTextField();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jPanelSenha = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jTxtSenha = new javax.swing.JTextField();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jBtnCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Logo.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 92, 95));
        jLabel3.setText("Cadastre-se");

        jPanelNome.setBackground(new java.awt.Color(234, 234, 234));
        jPanelNome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_name.png"))); // NOI18N
        jPanelNome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));
        jPanelNome.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, -1));
        jPanelNome.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, -1));

        jTxtNome.setBackground(new java.awt.Color(234, 234, 234));
        jTxtNome.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jTxtNome.setForeground(new java.awt.Color(150, 150, 150));
        jTxtNome.setText("Informe o Nome");
        jTxtNome.setBorder(null);
        jTxtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtNomeFocusLost(evt);
            }
        });
        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        jPanelNome.add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 350, -1));
        jPanelNome.add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, -1));
        jPanelNome.add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, -1));
        jPanelNome.add(filler6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanelNome.add(filler7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanelCNPJ.setBackground(new java.awt.Color(234, 234, 234));
        jPanelCNPJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_cnpj.png"))); // NOI18N
        jPanelCNPJ.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));
        jPanelCNPJ.add(filler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, -1));
        jPanelCNPJ.add(filler8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, -1));

        jTxtCnpj.setBackground(new java.awt.Color(234, 234, 234));
        jTxtCnpj.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jTxtCnpj.setForeground(new java.awt.Color(150, 150, 150));
        jTxtCnpj.setText("Informe o CNPJ");
        jTxtCnpj.setBorder(null);
        jTxtCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtCnpjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtCnpjFocusLost(evt);
            }
        });
        jTxtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCnpjActionPerformed(evt);
            }
        });
        jPanelCNPJ.add(jTxtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 350, -1));
        jPanelCNPJ.add(filler9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, -1));
        jPanelCNPJ.add(filler10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, -1));
        jPanelCNPJ.add(filler11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanelCNPJ.add(filler12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanelEmail.setBackground(new java.awt.Color(234, 234, 234));
        jPanelEmail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_email.png"))); // NOI18N
        jPanelEmail.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));
        jPanelEmail.add(filler13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, -1));
        jPanelEmail.add(filler14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, -1));

        jTxtEmail.setBackground(new java.awt.Color(234, 234, 234));
        jTxtEmail.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jTxtEmail.setForeground(new java.awt.Color(150, 150, 150));
        jTxtEmail.setText("Informe o Email");
        jTxtEmail.setBorder(null);
        jTxtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtEmailFocusLost(evt);
            }
        });
        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });
        jPanelEmail.add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 350, -1));
        jPanelEmail.add(filler15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, -1));
        jPanelEmail.add(filler16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, -1));
        jPanelEmail.add(filler17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanelEmail.add(filler18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanelSenha.setBackground(new java.awt.Color(234, 234, 234));
        jPanelSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icon_password.png"))); // NOI18N
        jPanelSenha.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));
        jPanelSenha.add(filler19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, -1));
        jPanelSenha.add(filler20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, -1));

        jTxtSenha.setBackground(new java.awt.Color(234, 234, 234));
        jTxtSenha.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jTxtSenha.setForeground(new java.awt.Color(150, 150, 150));
        jTxtSenha.setText("Informe a Senha");
        jTxtSenha.setBorder(null);
        jTxtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtSenhaFocusLost(evt);
            }
        });
        jTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSenhaActionPerformed(evt);
            }
        });
        jPanelSenha.add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 350, -1));
        jPanelSenha.add(filler21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, -1));
        jPanelSenha.add(filler22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, -1));
        jPanelSenha.add(filler23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanelSenha.add(filler24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jBtnCadastrar.setBackground(new java.awt.Color(150, 150, 150));
        jBtnCadastrar.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCadastrar.setText("CADASTRAR");
        jBtnCadastrar.setBorder(null);
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(91, 92, 95));
        jLabel6.setText("Voltar para o login");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jPanelCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2)
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jPanelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanelCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLblImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLblImagem)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCnpjActionPerformed

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSenhaActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        FormEntrar entrar = new FormEntrar();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTxtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNomeFocusGained
        if (jTxtNome.getText().trim().equals("Informe o Nome")) {
            jTxtNome.setText("");
            jTxtNome.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtNomeFocusGained

    private void jTxtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNomeFocusLost
        if (jTxtNome.getText().trim().equals("")) {
            jTxtNome.setText("Informe o Nome");
            jTxtNome.setForeground(new Color(199,199,199));
        }
    }//GEN-LAST:event_jTxtNomeFocusLost

    private void jTxtCnpjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCnpjFocusGained
        if (jTxtCnpj.getText().trim().equals("Informe o CNPJ")) {
            jTxtCnpj.setText("");
            jTxtCnpj.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtCnpjFocusGained

    private void jTxtCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCnpjFocusLost
        if (jTxtCnpj.getText().trim().equals("")) {
            jTxtCnpj.setText("Informe o CNPJ");
            jTxtCnpj.setForeground(new Color(199,199,199));
        }
    }//GEN-LAST:event_jTxtCnpjFocusLost

    private void jTxtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtEmailFocusGained
        if (jTxtEmail.getText().trim().equals("Informe o Email")) {
            jTxtEmail.setText("");
            jTxtEmail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtEmailFocusGained

    private void jTxtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtEmailFocusLost
        if (jTxtEmail.getText().trim().equals("")) {
            jTxtEmail.setText("Informe o Email");
            jTxtEmail.setForeground(new Color(199,199,199));
        }
    }//GEN-LAST:event_jTxtEmailFocusLost

    private void jTxtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtSenhaFocusGained
        if (jTxtSenha.getText().trim().equals("Informe a Senha")) {
            jTxtSenha.setText("");
            jTxtSenha.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTxtSenhaFocusGained

    private void jTxtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtSenhaFocusLost
        if (jTxtSenha.getText().trim().equals("")) {
            jTxtSenha.setText("Informe a Senha");
            jTxtSenha.setForeground(new Color(199,199,199));
        }
    }//GEN-LAST:event_jTxtSenhaFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblImagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCNPJ;
    private javax.swing.JPanel jPanelEmail;
    private javax.swing.JPanel jPanelNome;
    private javax.swing.JPanel jPanelSenha;
    private javax.swing.JTextField jTxtCnpj;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSenha;
    // End of variables declaration//GEN-END:variables
}
