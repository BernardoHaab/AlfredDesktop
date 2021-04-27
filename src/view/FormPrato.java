/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import modelDominio.Prato;

/**
 *
 * @author be_ha
 */
public class FormPrato extends javax.swing.JDialog {
    
    private Prato pratoEdit = null;

    /**
     * Creates new form FormPrato
     */
    public FormPrato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public FormPrato(java.awt.Frame parent, boolean modal, Prato prato) {
        super(parent, modal);
        this.pratoEdit = prato;
        initComponents();
        jTxtNome.setText(this.pratoEdit.getNomePrato());
        jTxtDescricao.setText(this.pratoEdit.getDescricaoPrato());
        jTxtValor.setValue(this.pratoEdit.getValorPrato());
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
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jTxtValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(150, 150, 150));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel1.setText("Nome");

        jTxtNome.setBackground(new java.awt.Color(234, 234, 234));
        jTxtNome.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(150, 150, 150));
        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(150, 150, 150));
        jLabel2.setText("Descrição");

        jTxtDescricao.setBackground(new java.awt.Color(234, 234, 234));
        jTxtDescricao.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(150, 150, 150));
        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(150, 150, 150));
        jLabel3.setText("Valor(R$)");

        jBtnCancelar.setBackground(new java.awt.Color(150, 150, 150));
        jBtnCancelar.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setBorder(null);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnSalvar.setBackground(new java.awt.Color(150, 150, 150));
        jBtnSalvar.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jBtnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSalvar.setText("Salvar");
        jBtnSalvar.setBorder(null);
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jTxtValor.setBackground(new java.awt.Color(234, 234, 234));
        jTxtValor.setBorder(null);
        jTxtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jTxtValor.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342)
                        .addComponent(jBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jTxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        String nome = jTxtNome.getText();
        String descricao = jTxtDescricao.getText();
        double valor = 0;
        
        try {
            valor = (((Number) jTxtValor.getValue()).doubleValue());
            System.out.println("valor = " + valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Valor",
                this.getTitle(), JOptionPane.ERROR_MESSAGE);
            jTxtValor.requestFocus();
            return;
        }
        
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome do prato", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            jTxtNome.requestFocus();
        } else if (descricao.equals("")) {
            JOptionPane.showMessageDialog(this, "Adicione uma descrição para o prato", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            jTxtDescricao.requestFocus();
        } else{
            Prato prato = new Prato(nome, descricao, valor, AlfredCliente.ccont.empresa);
            if (this.pratoEdit == null) {
                this.inserirPrato(prato);
            } else {
                prato.setCodPrato(this.pratoEdit.getCodPrato());
                this.alterarPrato(prato);
            }
        }
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void inserirPrato(Prato prato) {
        boolean ok = AlfredCliente.ccont.pratoInserir(prato);

        if (ok) {
            double precoMedioEmpresa = AlfredCliente.ccont.buscarPrecoMedioEmpresa();
            AlfredCliente.ccont.empresa.setPrecoMedioEmpresa(precoMedioEmpresa);
            JOptionPane.showMessageDialog(this, "Prato inserido com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir prato", this.getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void alterarPrato(Prato prato) {
        boolean ok = AlfredCliente.ccont.pratoAlterar(prato);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Prato atualizado com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar prato", this.getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrato dialog = new FormPrato(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtDescricao;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JFormattedTextField jTxtValor;
    // End of variables declaration//GEN-END:variables
}
