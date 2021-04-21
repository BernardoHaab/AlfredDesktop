/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelDominio.Empresa;
import modelDominio.Prato;
import view.tablemodel.PratosTableModel;

/**
 *
 * @author be_ha
 */
public class Home extends javax.swing.JFrame {
    
    private PratosTableModel pratoModel;
    
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
        jTblPendentes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblAceitos = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelPratos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblPratos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();

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
        jBtnAvaliacoes.setText("Visualizar Avaliações");
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

        jTblPendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTblPendentes);

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
        jScrollPane3.setViewportView(jTblAceitos);

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 30)); // NOI18N
        jLabel6.setText("Pedidos Recusados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelPedidosLayout = new javax.swing.GroupLayout(jPanelPedidos);
        jPanelPedidos.setLayout(jPanelPedidosLayout);
        jPanelPedidosLayout.setHorizontalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
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
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
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
        jLabel2.setText("Pratos disponíveis");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnAddPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jBtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jBtnAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15)
                                .addComponent(jCbxRestauranteStatus)))
                        .addGap(0, 592, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelPratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCbxRestauranteStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
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
        ArrayList<Prato> listaPrato = AlfredCliente.ccont.pratoListaEmpresa(AlfredCliente.ccont.empresa.getCodEmpresa());
        System.out.println(listaPrato);
        pratoModel = new PratosTableModel(listaPrato);
        jTblPratos.setModel(pratoModel);
    }

    
    private void jTxtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPesquisaActionPerformed

    private void jBtnAvaliacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAvaliacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAvaliacoesActionPerformed

    private void jBtnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarPerfilActionPerformed
        FormPerfil formPerfil = new FormPerfil(this, true);
        formPerfil.setVisible(true);
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
    }//GEN-LAST:event_jBtnAddPratoActionPerformed

    private void jCbxRestauranteStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbxRestauranteStatusMouseClicked
        System.out.println(AlfredCliente.ccont.empresa.getCategoriaEmpresa());
        if (AlfredCliente.ccont.empresa.getCategoriaEmpresa().getCodCategoria() > 0) {
//            System.out.println(jCbxRestauranteStatus.isSelected());
            Empresa emp = new Empresa(AlfredCliente.ccont.empresa.getCodEmpresa(), jCbxRestauranteStatus.isSelected());
            String ok = AlfredCliente.ccont.abrirFecharempresa(emp);
            if (ok.equals("ok")) {
                AlfredCliente.ccont.empresa.setAbertoFechadoEmpresa(emp.getAbertoFechadoEmpresa());
                JOptionPane.showMessageDialog(this, "Restaurante aberto com sucesso", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao abrir restaurante!", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Você deve completar o cadastro antes de abrir o restaurante!", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            jCbxRestauranteStatus.setSelected(false);
        }
    }//GEN-LAST:event_jCbxRestauranteStatusMouseClicked

    private void jTblPratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblPratosMouseClicked
        FormPrato formPrato = new FormPrato(this, true, pratoModel.getPrato(jTblPratos.getSelectedRow()));
        formPrato.setVisible(true);
        this.atualizaTabelaPratos();
    }//GEN-LAST:event_jTblPratosMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPedidos;
    private javax.swing.JPanel jPanelPratos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTblAceitos;
    private javax.swing.JTable jTblPendentes;
    private javax.swing.JTable jTblPratos;
    private javax.swing.JTextField jTxtPesquisa;
    // End of variables declaration//GEN-END:variables
}
