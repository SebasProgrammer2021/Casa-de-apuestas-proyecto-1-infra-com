package casa_apuesta_1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane; 

/** 
 *
 * @author Santiago Martinez Ayala  
 */
public class ApuestaA extends javax.swing.JFrame {

    /**
     * Crea una forma de apuesta 
     */
    public ApuestaA() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Realizar Apuesta_A");

        JTF_NUMERO_APUESTA.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a un espacio*/)) {
                   // ignorar el evento de teclado
                    e.consume();  
                }
            }
        });
        JTF_CUENTAH_APUESTA.addKeyListener(new KeyAdapter() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JBT_REALIZAR_APUESTAa = new javax.swing.JButton();
        JTF_CUENTAH_APUESTA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTF_NUMERO_APUESTA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel5.setForeground(new java.awt.Color(0, 204, 51));
        jLabel5.setText("Recuerde que la apuesta de tipo A es de 4 digitos.");

        jLabel7.setForeground(new java.awt.Color(0, 204, 51));
        jLabel7.setText("Recuerde que las cuentas son de 7 digitos.");

        JBT_REALIZAR_APUESTAa.setBackground(new java.awt.Color(153, 255, 51));
        JBT_REALIZAR_APUESTAa.setText("Realizar Apuesta");
        JBT_REALIZAR_APUESTAa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_REALIZAR_APUESTAaActionPerformed(evt);
            }
        });

        JTF_CUENTAH_APUESTA.setBackground(new java.awt.Color(153, 255, 153));
        JTF_CUENTAH_APUESTA.setForeground(new java.awt.Color(0, 153, 0));
        JTF_CUENTAH_APUESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_CUENTAH_APUESTAActionPerformed(evt);
            }
        });
        JTF_CUENTAH_APUESTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_CUENTAH_APUESTAKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 51));
        jLabel3.setText("Realizar Apuesta Tipo A");

        jLabel8.setText("Numero Apuesta:");

        jLabel6.setText("Numero cuenta:");

        jLabel9.setForeground(new java.awt.Color(0, 204, 51));
        jLabel9.setText("debe constar con saldo suficiente y una cuenta si no es asi cree una.");

        JTF_NUMERO_APUESTA.setBackground(new java.awt.Color(153, 255, 153));
        JTF_NUMERO_APUESTA.setForeground(new java.awt.Color(0, 153, 0));
        JTF_NUMERO_APUESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_NUMERO_APUESTAActionPerformed(evt);
            }
        });
        JTF_NUMERO_APUESTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_NUMERO_APUESTAKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTF_CUENTAH_APUESTA)
                                    .addComponent(JTF_NUMERO_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95))))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(JBT_REALIZAR_APUESTAa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTF_CUENTAH_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_NUMERO_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(JBT_REALIZAR_APUESTAa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBT_REALIZAR_APUESTAaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_REALIZAR_APUESTAaActionPerformed
        // TODO add your handling code here:
        Cajero_interface cjjjjj = new Cajero_interface();
        if(JTF_CUENTAH_APUESTA.getText().length()>=6 && JTF_NUMERO_APUESTA.getText().length() !=0){
            cjjjjj.Tranferencia(JTF_CUENTAH_APUESTA.getText(),JTF_NUMERO_APUESTA.getText());
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(null, "llene todos los campos ");
        }
    }//GEN-LAST:event_JBT_REALIZAR_APUESTAaActionPerformed

    private void JTF_CUENTAH_APUESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_CUENTAH_APUESTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_CUENTAH_APUESTAActionPerformed

    private void JTF_CUENTAH_APUESTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_CUENTAH_APUESTAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_CUENTAH_APUESTAKeyTyped

    private void JTF_NUMERO_APUESTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_NUMERO_APUESTAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NUMERO_APUESTAKeyTyped

    private void JTF_NUMERO_APUESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_NUMERO_APUESTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NUMERO_APUESTAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApuestaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApuestaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApuestaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApuestaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApuestaA().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_REALIZAR_APUESTAa;
    private javax.swing.JTextField JTF_CUENTAH_APUESTA;
    private javax.swing.JTextField JTF_NUMERO_APUESTA;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
