/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa_apuesta_1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane; 

/**
 *
 * @author Rodrigo Acosta Restrepo.
 * @author Juan Sebastián Tobón.
 * @author Sebastián Londoño Valencia.
 */
public class Cancelar_apuesta extends javax.swing.JFrame {

    /**
     * Creates new form Cancelar_bolsillo
     */
    public Cancelar_apuesta() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("CANCELAR APUESTA");
        
        JTF_CUENTA_Evento_null.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a un espacio*/)) {
                   // ignorar el evento de teclado
                    e.consume();  
                }
            }
        });
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBT_CANCELAR_Evento_null = new javax.swing.JButton();
        JTF_CUENTA_Evento_null = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setText("ingrese una cuenta existente");

        jLabel4.setText("Recuerde que las cuentas son de 7 gigitos y una letra b");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JBT_CANCELAR_Evento_null.setBackground(new java.awt.Color(0, 0, 0));
        JBT_CANCELAR_Evento_null.setForeground(new java.awt.Color(255, 255, 255));
        JBT_CANCELAR_Evento_null.setText("evento null");
        JBT_CANCELAR_Evento_null.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_CANCELAR_Evento_nullActionPerformed(evt);
            }
        });

        JTF_CUENTA_Evento_null.setBackground(new java.awt.Color(153, 153, 153));
        JTF_CUENTA_Evento_null.setForeground(new java.awt.Color(255, 255, 255));
        JTF_CUENTA_Evento_null.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_CUENTA_Evento_nullActionPerformed(evt);
            }
        });
        JTF_CUENTA_Evento_null.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_CUENTA_Evento_nullKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 3, 18)); // NOI18N
        jLabel3.setText("Cancelar Apuesta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cuenta:");

        jLabel5.setText("ingrese una apuesta existente.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTF_CUENTA_Evento_null, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JBT_CANCELAR_Evento_null)
                                        .addGap(100, 100, 100)))
                                .addComponent(jLabel8)))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_CUENTA_Evento_null, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addComponent(JBT_CANCELAR_Evento_null, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBT_CANCELAR_Evento_nullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_CANCELAR_Evento_nullActionPerformed
        // TODO add your handling code here:
        Cajero_interface cajero = new Cajero_interface();
        if(JTF_CUENTA_Evento_null.getText().length()>=6){
            cajero.cancelarapuesta(JTF_CUENTA_Evento_null.getText());
            this.dispose();
           
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una cuenta");
        }

    }//GEN-LAST:event_JBT_CANCELAR_Evento_nullActionPerformed

    private void JTF_CUENTA_Evento_nullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_CUENTA_Evento_nullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_CUENTA_Evento_nullActionPerformed

    private void JTF_CUENTA_Evento_nullKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_CUENTA_Evento_nullKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_JTF_CUENTA_Evento_nullKeyTyped

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
            java.util.logging.Logger.getLogger(Cancelar_apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancelar_apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancelar_apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancelar_apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancelar_apuesta().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_CANCELAR_Evento_null;
    private javax.swing.JTextField JTF_CUENTA_Evento_null;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
