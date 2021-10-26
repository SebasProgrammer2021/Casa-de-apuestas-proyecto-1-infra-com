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
public class ApuestaC extends javax.swing.JFrame {

    /**
     * Crea una forma de apuesta
     */
    public ApuestaC() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Realizar Apuesta_C");

        numeroApuesta.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a un espacio*/)) {
                    // ignorar el evento de teclado
                    e.consume();
                }
            }
        });
        numeroCuenta.addKeyListener(new KeyAdapter() {
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
        JBT_REALIZAR_APUESTAc = new javax.swing.JButton();
        numeroCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numeroApuesta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel5.setText("Recuerde que la apuesta de tipo C es de dos digitos.");

        jLabel7.setText("Recuerde que las cuentas son de 7 digitos.");

        JBT_REALIZAR_APUESTAc.setBackground(new java.awt.Color(0, 0, 0));
        JBT_REALIZAR_APUESTAc.setForeground(new java.awt.Color(255, 255, 255));
        JBT_REALIZAR_APUESTAc.setText("Realizar Apuesta");
        JBT_REALIZAR_APUESTAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_REALIZAR_APUESTAcActionPerformed(evt);
            }
        });

        numeroCuenta.setBackground(new java.awt.Color(153, 153, 153));
        numeroCuenta.setForeground(new java.awt.Color(255, 255, 255));
        numeroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCuentaActionPerformed(evt);
            }
        });
        numeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroCuentaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 3, 18)); // NOI18N
        jLabel3.setText("Apuesta Tipo C");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Numero Apuesta:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Numero cuenta:");

        jLabel9.setText("Debe constar con saldo suficiente y una cuenta existente.");

        numeroApuesta.setBackground(new java.awt.Color(153, 153, 153));
        numeroApuesta.setForeground(new java.awt.Color(255, 255, 255));
        numeroApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroApuestaActionPerformed(evt);
            }
        });
        numeroApuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroApuestaKeyTyped(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(95, 95, 95))))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(JBT_REALIZAR_APUESTAc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numeroApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(JBT_REALIZAR_APUESTAc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBT_REALIZAR_APUESTAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_REALIZAR_APUESTAcActionPerformed
        // TODO add your handling code here:
        Cajero_interface cajero = new Cajero_interface();
        if (numeroCuenta.getText().length() >= 6 && numeroApuesta.getText().length() != 0) {
            cajero.realizarApuesta(numeroCuenta.getText(), "C", numeroApuesta.getText());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "llene todos los campos ");
        }
    }//GEN-LAST:event_JBT_REALIZAR_APUESTAcActionPerformed

    private void numeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCuentaActionPerformed

    private void numeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroCuentaKeyTyped

    }//GEN-LAST:event_numeroCuentaKeyTyped

    private void numeroApuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroApuestaKeyTyped
        if (numeroApuesta.getText().length() > 1) {
            evt.consume();
        }
    }//GEN-LAST:event_numeroApuestaKeyTyped

    private void numeroApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroApuestaActionPerformed

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
            java.util.logging.Logger.getLogger(ApuestaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApuestaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApuestaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApuestaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApuestaC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_REALIZAR_APUESTAc;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numeroApuesta;
    private javax.swing.JTextField numeroCuenta;
    // End of variables declaration//GEN-END:variables
}
