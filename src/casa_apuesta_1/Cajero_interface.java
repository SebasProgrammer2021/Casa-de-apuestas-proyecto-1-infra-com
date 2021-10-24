package casa_apuesta_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TitledPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashMap;
import javax.print.DocFlavor;
import javax.swing.JCheckBox;

/**
 *
 * @author Santiago Martinez Ayala
 */
public class Cajero_interface extends javax.swing.JFrame {
//este es el cliente quien envia las peticiones al servidor

    //creacion de cliente
//Host del servidor
    final String HOST = "127.0.0.1";
    //Puerto del servidor
    final int PUERTO = 5000;
    DataInputStream in;
    DataOutputStream out;

//manejo de datos
    String nombre;
    String apellido;
    String saldo;
    String ar[] = new String[3];

    public Cajero_interface() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CASA BET369");

        //repintar ondas
        Imagen Imagen = new Imagen();
        //carga imagenes al jframe
        panel.add(Imagen);
        panel.repaint();
        //repintar icono
        Imagen2 Imagen2 = new Imagen2();
        NULL.add(Imagen2);
        NULL.repaint();

        fechaup();
        //Tabla.main(new String[0]);

    }

    public void fechaup() {
        //FECHA
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        JTF_FECHA.setText("Fecha: " + dtf5.format(LocalDateTime.now()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Abrir_cuenta = new javax.swing.JButton();
        CANCELAR_CUENTA_APUESTAS = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        NULL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DEPOSITAR_DINERO = new javax.swing.JButton();
        RETIRAR_DINERO = new javax.swing.JButton();
        CARGA_AUTO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JTF_FECHA = new javax.swing.JLabel();
        REALIZAR_APUESTA = new javax.swing.JButton();
        CANCELAR_APUESTA = new javax.swing.JButton();
        CONSULTAR_SALDO = new javax.swing.JButton();
        EVENTO_NULL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("EL MINICOMBO APUESTAS");

        Abrir_cuenta.setBackground(new java.awt.Color(153, 255, 153));
        Abrir_cuenta.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        Abrir_cuenta.setText("Abrir cuenta");
        Abrir_cuenta.setToolTipText("");
        Abrir_cuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Abrir_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_cuentaActionPerformed(evt);
            }
        });

        CANCELAR_CUENTA_APUESTAS.setBackground(new java.awt.Color(153, 255, 153));
        CANCELAR_CUENTA_APUESTAS.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CANCELAR_CUENTA_APUESTAS.setText("Cancelar cuenta ");
        CANCELAR_CUENTA_APUESTAS.setBorder(null);
        CANCELAR_CUENTA_APUESTAS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CANCELAR_CUENTA_APUESTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELAR_CUENTA_APUESTASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        NULL.setForeground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout NULLLayout = new javax.swing.GroupLayout(NULL);
        NULL.setLayout(NULLLayout);
        NULLLayout.setHorizontalGroup(
            NULLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
        NULLLayout.setVerticalGroup(
            NULLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("POR FAVOR SELECCIONE UNA OPCION.");

        DEPOSITAR_DINERO.setBackground(new java.awt.Color(153, 255, 153));
        DEPOSITAR_DINERO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        DEPOSITAR_DINERO.setText("Depositar dinero");
        DEPOSITAR_DINERO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DEPOSITAR_DINERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITAR_DINEROActionPerformed(evt);
            }
        });

        RETIRAR_DINERO.setBackground(new java.awt.Color(153, 255, 153));
        RETIRAR_DINERO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        RETIRAR_DINERO.setText("Retirar dinero ");
        RETIRAR_DINERO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RETIRAR_DINERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETIRAR_DINEROActionPerformed(evt);
            }
        });

        CARGA_AUTO.setBackground(new java.awt.Color(153, 255, 153));
        CARGA_AUTO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CARGA_AUTO.setForeground(new java.awt.Color(255, 255, 255));
        CARGA_AUTO.setText("CARGA AUTOMATICA");
        CARGA_AUTO.setBorder(null);
        CARGA_AUTO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CARGA_AUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARGA_AUTOActionPerformed(evt);
            }
        });

        JTF_FECHA.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JTF_FECHA.setForeground(new java.awt.Color(102, 255, 102));

        REALIZAR_APUESTA.setBackground(new java.awt.Color(153, 255, 153));
        REALIZAR_APUESTA.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        REALIZAR_APUESTA.setText("Hacer apuesta ");
        REALIZAR_APUESTA.setBorder(null);
        REALIZAR_APUESTA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        REALIZAR_APUESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REALIZAR_APUESTAActionPerformed(evt);
            }
        });

        CANCELAR_APUESTA.setBackground(new java.awt.Color(153, 255, 153));
        CANCELAR_APUESTA.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CANCELAR_APUESTA.setText("Cancelar apuesta");
        CANCELAR_APUESTA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CANCELAR_APUESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELAR_APUESTAActionPerformed(evt);
            }
        });

        CONSULTAR_SALDO.setBackground(new java.awt.Color(153, 255, 153));
        CONSULTAR_SALDO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CONSULTAR_SALDO.setText("Consultar Saldo");
        CONSULTAR_SALDO.setToolTipText("");
        CONSULTAR_SALDO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CONSULTAR_SALDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTAR_SALDOActionPerformed(evt);
            }
        });

        EVENTO_NULL.setBackground(new java.awt.Color(153, 255, 153));
        EVENTO_NULL.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        EVENTO_NULL.setText("null");
        EVENTO_NULL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EVENTO_NULL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENTO_NULLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(342, 342, 342))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(302, 302, 302))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CANCELAR_CUENTA_APUESTAS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Abrir_cuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CANCELAR_APUESTA, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(CONSULTAR_SALDO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(DEPOSITAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NULL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RETIRAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTF_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(REALIZAR_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EVENTO_NULL, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(80, 80, 80)
                                        .addComponent(CARGA_AUTO, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Abrir_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(NULL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(JTF_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RETIRAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CANCELAR_CUENTA_APUESTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(REALIZAR_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CONSULTAR_SALDO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CARGA_AUTO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CANCELAR_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EVENTO_NULL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES DE ACCION TIPO CLIENTE 
    //fucncion en el cliente que realiza peticon al servert recibiendo datos de la vista abrir cuenta
    public void datos(String _nombre, String _apellido) {
        nombre = _nombre;
        apellido = _apellido;
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("ABRIR_CUENTA"); //mensaje al servidor
            out.writeUTF(nombre + " " + apellido); //elementos enviados al servidor

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            JOptionPane.showMessageDialog(null, mensaje);
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Crearapuesta(String n) {
        String cu = n;
        // TODO add your handling code here:
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CREAR_APUESTA");
            out.writeUTF(cu);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cancelarapuesta(String nn) {

        String n = nn;

        // TODO add your handling code here:
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CANCELAR_APUESTA");
            out.writeUTF(n);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CARGA() {

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CARGA");

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            String mensaje1 = in.readUTF();

            System.out.println("CUENTAS AUTOCARGA" + mensaje + " " + mensaje1);

            ar[0] = mensaje;
            ar[1] = mensaje1;

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        };

    }
    private void Abrir_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_cuentaActionPerformed

        Abrir_cuenta_datos acd = new Abrir_cuenta_datos();
        acd.setVisible(true);


    }//GEN-LAST:event_Abrir_cuentaActionPerformed

    public void realizarApuesta(String _numeroCuenta, String _numeroApuesta) {
        String numeroCuenta = _numeroCuenta;
        String numeroApuesta = _numeroApuesta;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("APOSTAR_TIPO_A");// out.writeUTF("TRASLADAR"); 
            out.writeUTF(numeroCuenta);
            out.writeUTF(numeroApuesta);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            JOptionPane.showMessageDialog(null, mensaje);
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void CONSULTAR_SALDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTAR_SALDOActionPerformed
        Consultar_saldo tf = new Consultar_saldo();
        tf.setVisible(true);
    }//GEN-LAST:event_CONSULTAR_SALDOActionPerformed


    private void EVENTO_NULLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVENTO_NULLActionPerformed

        ApuestaB cre = new ApuestaB();
        cre.setVisible(true);

    }//GEN-LAST:event_EVENTO_NULLActionPerformed

    private void CANCELAR_APUESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELAR_APUESTAActionPerformed
        Cancelar_null cacel = new Cancelar_null();
        cacel.setVisible(true);

    }//GEN-LAST:event_CANCELAR_APUESTAActionPerformed

    public void cancelar_cuentas(String _numeroCuenta) {
        // TODO add your handling code here:
        String numeroCuenta = _numeroCuenta;
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CANCELAR_CUENTA");
            out.writeUTF(numeroCuenta);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void CANCELAR_CUENTA_APUESTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELAR_CUENTA_APUESTASActionPerformed
        Cancelar_cuenta cah = new Cancelar_cuenta();
        cah.setVisible(true);
    }//GEN-LAST:event_CANCELAR_CUENTA_APUESTASActionPerformed

    public void Depositar(String cu, String va) {
        // TODO add your handling code here:
        String c = cu;
        String v = va;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("DEPOSITAR");
            out.writeUTF(c);
            out.writeUTF(v);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void DEPOSITAR_DINEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITAR_DINEROActionPerformed
        Depositar dp = new Depositar();
        dp.setVisible(true);
    }//GEN-LAST:event_DEPOSITAR_DINEROActionPerformed

    public void Retirar(String cu, String va) {
        // TODO add your handling code here:

        String c = cu;
        String v = va;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("RETIRAR");
            out.writeUTF(c);
            out.writeUTF(v);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void RETIRAR_DINEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETIRAR_DINEROActionPerformed
        Retirar rt = new Retirar();
        rt.setVisible(true);
    }//GEN-LAST:event_RETIRAR_DINEROActionPerformed

    private void CARGA_AUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGA_AUTOActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "*****11 TRANSACCIONES AUTOMATICAS*****\n"
                + "ABRIR_CUENTA\n"
                + "ABRIR_CUENTA\n"
                + "CREAR_APUESTA\n"
                + "CREAR_APUESTA\n"
                + "CANCELAR_APUESTA\n"
                + "CANCELAR_APUESTA\n"
                + "DEPOSITAR\n"
                + "RETIRAR\n"
                + "CONSULTAR\n"
                + "CANCELAR_CUENTA\n"
                + "CANCELAR_CUENTA\n"
                + "CONSULTAR_DATOS_ACTUALES\n"
                + "\n***ACEPTE LOS MENSAJES DEL SERVIDOR***\n"
        );

        //MUESTRA POR CONSOLA LAS CUENTAS Y BOLSILLOS
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            // out.writeUTF("CANCELAR_CUENTA");
            out.writeUTF("MOSTRAR_HASH");

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

        datos("SANTIAGO", "MARTINEZ");
        datos("CARLOS", "GOMEZ");
        CARGA();
        System.out.println("cuentas carga automatica: " + ar[0] + ar[1]);

        //esto se hace por que las cuentas las retorna el servidos sin ningun orden
        String cu = ar[0];
        String cu2 = ar[1];

        Crearapuesta(ar[0]);
        Crearapuesta(ar[1]);

        cancelarapuesta(ar[0]);
        cancelarapuesta(ar[1]);

        Depositar(cu, "100");
        Retirar(cu, "100");
        ConsultarS(cu);
        cancelar_cuentas(ar[0]);
        cancelar_cuentas(ar[1]);


    }//GEN-LAST:event_CARGA_AUTOActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed
    public void ConsultarS(String cu) {
        // TODO add your handling code here:
        String c = cu;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CONSULTAR");
            out.writeUTF(c);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ConsultarS_Apuesta(String cu) {
        // TODO add your handling code here:
        String c = cu;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CONSULTAR_APUESTA");
            out.writeUTF(c);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//********************************
    public void Consultar_Datos_Actuales(String cu) {
        // TODO add your handling code here:
        String c = cu;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            // out.writeUTF("CANCELAR_CUENTA");
            out.writeUTF("CONSULTAR_DATOS_ACTUALES");

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void REALIZAR_APUESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REALIZAR_APUESTAActionPerformed
        JCheckBox chec = new JCheckBox("Prueba");
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de apuesta: ",
                "Selector de opciones", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"Apuesta tipo A (4 últimas cifras en orden estricto).",
                     "Apuesta tipo B (3 últimas cifras en orden estricto).",
                     "Apuesta tipo C (2 últimas cifras en orden estricto)."},
                 "SALIR");

        if (seleccion == 2) {
            System.out.println("seleccionada opcion " + seleccion);
            ApuestaC csb = new ApuestaC();
            csb.setVisible(true);

        } else {
            System.out.println("SELECCIONADO NADA" + seleccion);

        }
        if (seleccion == 1) {
            System.out.println("seleccionada opcion " + seleccion);
            ApuestaB csb = new ApuestaB();
            csb.setVisible(true);

        }
        if (seleccion == 0) {
            System.out.println("seleccionada opcion " + seleccion);
            ApuestaA csb = new ApuestaA();
            csb.setVisible(true);

        }


    }//GEN-LAST:event_REALIZAR_APUESTAActionPerformed

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
            java.util.logging.Logger.getLogger(Cajero_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero_interface().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir_cuenta;
    private javax.swing.JButton CANCELAR_APUESTA;
    private javax.swing.JButton CANCELAR_CUENTA_APUESTAS;
    private javax.swing.JButton CARGA_AUTO;
    private javax.swing.JButton CONSULTAR_SALDO;
    private javax.swing.JButton DEPOSITAR_DINERO;
    private javax.swing.JButton EVENTO_NULL;
    private javax.swing.JLabel JTF_FECHA;
    private javax.swing.JPanel NULL;
    private javax.swing.JButton REALIZAR_APUESTA;
    private javax.swing.JButton RETIRAR_DINERO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

//repintar imagenes en los paneles
    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(panel.getSize()); //se selecciona el tamaño del panel

        }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
            Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/bet365.png"));

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    public class Imagen2 extends javax.swing.JPanel {

        public Imagen2() {
            this.setSize(NULL.getSize()); //se selecciona el tamaño del panel

        }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/bet365.png"));

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/bet365.png"));

        return retValue;
    }

}
