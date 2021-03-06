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
public class Retirar extends javax.swing.JFrame {

    /**
     *  Retirar
     */
    public Retirar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RETIRAR CUENTA");

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
        
        JTF_VALOR_RETIRAR.addKeyListener(new KeyAdapter() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JBT_RETIRAR_DINERO = new javax.swing.JButton();
        numeroCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTF_VALOR_RETIRAR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cuenta:");

        jLabel5.setText("ingrese el valor a Retirar sin puntos.");

        jLabel7.setText("Recuerde el numero de cuenta de la cual va a retirar.");

        JBT_RETIRAR_DINERO.setBackground(new java.awt.Color(0, 0, 0));
        JBT_RETIRAR_DINERO.setForeground(new java.awt.Color(255, 255, 255));
        JBT_RETIRAR_DINERO.setText("RETIRAR");
        JBT_RETIRAR_DINERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_RETIRAR_DINEROActionPerformed(evt);
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
        jLabel3.setText("Retirar Fondos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Valor a retirar:");

        JTF_VALOR_RETIRAR.setBackground(new java.awt.Color(153, 153, 153));
        JTF_VALOR_RETIRAR.setForeground(new java.awt.Color(255, 255, 255));
        JTF_VALOR_RETIRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_VALOR_RETIRARActionPerformed(evt);
            }
        });
        JTF_VALOR_RETIRAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_VALOR_RETIRARKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_VALOR_RETIRAR, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(numeroCuenta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(JBT_RETIRAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTF_VALOR_RETIRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(JBT_RETIRAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBT_RETIRAR_DINEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_RETIRAR_DINEROActionPerformed
        // TODO add your handling code here:
        Cajero_interface cajero = new Cajero_interface();
        if (numeroCuenta.getText().length() > 0 && JTF_VALOR_RETIRAR.getText().length() > 0) {
            cajero.Retirar(numeroCuenta.getText(), JTF_VALOR_RETIRAR.getText());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cuenta y un valor a RETIRAR");
        }
    }//GEN-LAST:event_JBT_RETIRAR_DINEROActionPerformed

    
    private void numeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCuentaActionPerformed

    private void numeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroCuentaKeyTyped
 
    }//GEN-LAST:event_numeroCuentaKeyTyped

    private void JTF_VALOR_RETIRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_VALOR_RETIRARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_VALOR_RETIRARActionPerformed

    private void JTF_VALOR_RETIRARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_VALOR_RETIRARKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_VALOR_RETIRARKeyTyped

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
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar().setVisible(true);
            }
        });
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_RETIRAR_DINERO;
    private javax.swing.JTextField JTF_VALOR_RETIRAR;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField numeroCuenta;
    // End of variables declaration//GEN-END:variables
}
