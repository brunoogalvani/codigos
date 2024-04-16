/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.usjt.elevador;

/**
 *
 * @author 82411888
 */
public class TelaElevador extends javax.swing.JFrame {
    private Elevador elevador;
    
    /**
     * Creates new form ElevadorTela
     */
    public TelaElevador() {
        elevador = new Elevador();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elevadorSubirBotao = new javax.swing.JButton();
        elevadorDescerBotao = new javax.swing.JButton();
        entrarGenteBotao = new javax.swing.JButton();
        subirPessoaBotao = new javax.swing.JButton();
        descerPessoaBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qtdPessoasLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sentidoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elevadorSubirBotao.setText("Subir");
        elevadorSubirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadorSubirBotaoActionPerformed(evt);
            }
        });

        elevadorDescerBotao.setText("Descer");
        elevadorDescerBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadorDescerBotaoActionPerformed(evt);
            }
        });

        entrarGenteBotao.setText("Entrar Gente...");
        entrarGenteBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarGenteBotaoActionPerformed(evt);
            }
        });

        subirPessoaBotao.setText("Subir Pessoa");

        descerPessoaBotao.setText("Descer Pessoa");

        jLabel1.setText("Quantidade de Pessoas:");

        qtdPessoasLabel.setText("0");

        jLabel2.setText("Sentido do Elevador:");

        sentidoLabel.setText("Subindo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(entrarGenteBotao)
                                .addGap(18, 18, 18)
                                .addComponent(subirPessoaBotao)
                                .addGap(18, 18, 18)
                                .addComponent(descerPessoaBotao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdPessoasLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sentidoLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(elevadorSubirBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(elevadorDescerBotao)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(qtdPessoasLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sentidoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevadorSubirBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevadorDescerBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarGenteBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subirPessoaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descerPessoaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elevadorSubirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadorSubirBotaoActionPerformed
        elevador.sobe();
        sentidoLabel.setText("Subindo");
    }//GEN-LAST:event_elevadorSubirBotaoActionPerformed

    private void elevadorDescerBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadorDescerBotaoActionPerformed
        elevador.desce();
        sentidoLabel.setText("Descendo");
    }//GEN-LAST:event_elevadorDescerBotaoActionPerformed

    private void entrarGenteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarGenteBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarGenteBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElevador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton descerPessoaBotao;
    private javax.swing.JButton elevadorDescerBotao;
    private javax.swing.JButton elevadorSubirBotao;
    private javax.swing.JButton entrarGenteBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel qtdPessoasLabel;
    private javax.swing.JLabel sentidoLabel;
    private javax.swing.JButton subirPessoaBotao;
    // End of variables declaration//GEN-END:variables
}