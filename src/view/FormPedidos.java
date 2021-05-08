/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import modelDominio.Pedido;
import modelDominio.PratoPedido;
import view.tablemodel.PratoPedidoTableModel;

/**
 *
 * @author be_ha
 */
public class FormPedidos extends javax.swing.JDialog {
    
    private Pedido pedido = null;

    /**
     * Creates new form FormPedidos
     */
    public FormPedidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public FormPedidos(java.awt.Frame parent, boolean modal, Pedido pedido) {
        super(parent, modal);
        initComponents();
        this.pedido = pedido;
        if (pedido.getStatusPedido() != 0) {
            jBtnAceita.setVisible(false);
            jBtnRecusar.setVisible(false);
        }
        jLblNome.setText(pedido.getCliente().getNomeCliente());
        jLblEndereco.setText(pedido.getEnderecoCliente());
        jLblObs.setText(pedido.getObservacaoPedido());
        this.atualizaTabelaPratosPedido();
    }
    
    private void atualizaTabelaPratosPedido() {
        ArrayList<PratoPedido> listaPedido = AlfredCliente.ccont.listaPratosPedido(this.pedido.getCodPedido());
        PratoPedidoTableModel pratoPedidoModel = new PratoPedidoTableModel(listaPedido);
        jTblPratosPedido.setModel(pratoPedidoModel);
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
        jLabel1 = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLblEndereco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLblObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblPratosPedido = new javax.swing.JTable();
        jBtnVoltar = new javax.swing.JButton();
        jBtnAceita = new javax.swing.JButton();
        jBtnRecusar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel1.setText("Nome:");

        jLblNome.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel2.setText("Endereço:");

        jLblEndereco.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel3.setText("Observação:");

        jLblObs.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N

        jTblPratosPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTblPratosPedido);

        jBtnVoltar.setBackground(new java.awt.Color(150, 150, 150));
        jBtnVoltar.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnVoltar.setText("Voltar");
        jBtnVoltar.setBorder(null);
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        jBtnAceita.setBackground(new java.awt.Color(150, 150, 150));
        jBtnAceita.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnAceita.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAceita.setText("Aceitar Pedido");
        jBtnAceita.setBorder(null);
        jBtnAceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceitaActionPerformed(evt);
            }
        });

        jBtnRecusar.setBackground(new java.awt.Color(150, 150, 150));
        jBtnRecusar.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnRecusar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRecusar.setText("Recusar");
        jBtnRecusar.setBorder(null);
        jBtnRecusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRecusarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLblObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnRecusar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jBtnAceita, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLblObs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAceita, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRecusar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceitaActionPerformed
        Pedido pedidoAlterado = pedido;
        pedidoAlterado.setStatusPedido(1);
        
        AlfredCliente.ccont.pedidoAlterar(pedidoAlterado);
    }//GEN-LAST:event_jBtnAceitaActionPerformed

    private void jBtnRecusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecusarActionPerformed
        Pedido pedidoAlterado = pedido;
        pedidoAlterado.setStatusPedido(2);
        
        AlfredCliente.ccont.pedidoAlterar(pedidoAlterado);
    }//GEN-LAST:event_jBtnRecusarActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPedidos dialog = new FormPedidos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceita;
    private javax.swing.JButton jBtnRecusar;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblObs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblPratosPedido;
    // End of variables declaration//GEN-END:variables
}
