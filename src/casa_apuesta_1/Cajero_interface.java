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
 * @author Rodrigo Acosta Restrepo.
 * @author Juan Sebastián Tobón.
 * @author Sebastián Londoño Valencia.
 */
public class Cajero_interface extends javax.swing.JFrame {
//este es el cliente quien envia las peticiones al servidor

    boolean banderaVal = true;
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
        //Color JFrame
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);
        this.setTitle("APUESTAS MINICOMBO");

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

        DEPOSITAR_DINERO = new javax.swing.JButton();
        CANCELAR_APUESTA = new javax.swing.JButton();
        REALIZAR_APUESTA = new javax.swing.JButton();
        CONSULTAR_SALDO = new javax.swing.JButton();
        CANCELAR_CUENTA_APUESTAS = new javax.swing.JButton();
        JTF_FECHA = new javax.swing.JLabel();
        NULL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Abrir_cuenta = new javax.swing.JButton();
        RETIRAR_DINERO = new javax.swing.JButton();
        cerrarApuestas = new javax.swing.JButton();
        CARGA_AUTO = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        realizarSorteo_Button = new javax.swing.JButton();
        reporteApuestas_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(204, 0, 0));
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        DEPOSITAR_DINERO.setBackground(new java.awt.Color(0, 0, 0));
        DEPOSITAR_DINERO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        DEPOSITAR_DINERO.setForeground(new java.awt.Color(255, 255, 255));
        DEPOSITAR_DINERO.setText("Depositar dinero");
        DEPOSITAR_DINERO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DEPOSITAR_DINERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITAR_DINEROActionPerformed(evt);
            }
        });

        CANCELAR_APUESTA.setBackground(new java.awt.Color(0, 0, 0));
        CANCELAR_APUESTA.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CANCELAR_APUESTA.setForeground(new java.awt.Color(255, 255, 255));
        CANCELAR_APUESTA.setText("Cancelar apuesta");
        CANCELAR_APUESTA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CANCELAR_APUESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELAR_APUESTAActionPerformed(evt);
            }
        });

        REALIZAR_APUESTA.setBackground(new java.awt.Color(0, 0, 0));
        REALIZAR_APUESTA.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        REALIZAR_APUESTA.setForeground(new java.awt.Color(255, 255, 255));
        REALIZAR_APUESTA.setText("Hacer apuesta ");
        REALIZAR_APUESTA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        REALIZAR_APUESTA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        REALIZAR_APUESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REALIZAR_APUESTAActionPerformed(evt);
            }
        });

        CONSULTAR_SALDO.setBackground(new java.awt.Color(0, 0, 0));
        CONSULTAR_SALDO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CONSULTAR_SALDO.setForeground(new java.awt.Color(255, 255, 255));
        CONSULTAR_SALDO.setText("Consultar Saldo");
        CONSULTAR_SALDO.setToolTipText("");
        CONSULTAR_SALDO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CONSULTAR_SALDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTAR_SALDOActionPerformed(evt);
            }
        });

        CANCELAR_CUENTA_APUESTAS.setBackground(new java.awt.Color(0, 0, 0));
        CANCELAR_CUENTA_APUESTAS.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CANCELAR_CUENTA_APUESTAS.setForeground(new java.awt.Color(255, 255, 255));
        CANCELAR_CUENTA_APUESTAS.setText("Cancelar cuenta ");
        CANCELAR_CUENTA_APUESTAS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CANCELAR_CUENTA_APUESTAS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CANCELAR_CUENTA_APUESTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELAR_CUENTA_APUESTASActionPerformed(evt);
            }
        });

        JTF_FECHA.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JTF_FECHA.setForeground(new java.awt.Color(0, 0, 255));
        JTF_FECHA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NULL.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout NULLLayout = new javax.swing.GroupLayout(NULL);
        NULL.setLayout(NULLLayout);
        NULLLayout.setHorizontalGroup(
            NULLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        NULLLayout.setVerticalGroup(
            NULLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APUESTAS EL MINICOMBO");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        Abrir_cuenta.setBackground(new java.awt.Color(0, 0, 0));
        Abrir_cuenta.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        Abrir_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        Abrir_cuenta.setText("Abrir cuenta");
        Abrir_cuenta.setToolTipText("");
        Abrir_cuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Abrir_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_cuentaActionPerformed(evt);
            }
        });

        RETIRAR_DINERO.setBackground(new java.awt.Color(0, 0, 0));
        RETIRAR_DINERO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        RETIRAR_DINERO.setForeground(new java.awt.Color(255, 255, 255));
        RETIRAR_DINERO.setText("Retirar dinero ");
        RETIRAR_DINERO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RETIRAR_DINERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETIRAR_DINEROActionPerformed(evt);
            }
        });

        cerrarApuestas.setBackground(new java.awt.Color(0, 0, 0));
        cerrarApuestas.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        cerrarApuestas.setForeground(new java.awt.Color(255, 255, 255));
        cerrarApuestas.setText("Cerrar Apuestas");
        cerrarApuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarApuestasActionPerformed(evt);
            }
        });

        CARGA_AUTO.setBackground(new java.awt.Color(0, 0, 0));
        CARGA_AUTO.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        CARGA_AUTO.setForeground(new java.awt.Color(255, 255, 255));
        CARGA_AUTO.setText("CARGA AUTOMATICA");
        CARGA_AUTO.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CARGA_AUTO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CARGA_AUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARGA_AUTOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        realizarSorteo_Button.setText("Realizar Sorteo");
        realizarSorteo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarSorteo_ButtonActionPerformed(evt);
            }
        });

        reporteApuestas_Button.setText("Reporte");
        reporteApuestas_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteApuestas_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NULL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RETIRAR_DINERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Abrir_cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITAR_DINERO, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(REALIZAR_APUESTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CANCELAR_CUENTA_APUESTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CONSULTAR_SALDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CANCELAR_APUESTA, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                            .addComponent(cerrarApuestas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(CARGA_AUTO, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(realizarSorteo_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reporteApuestas_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTF_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NULL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(JTF_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Abrir_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CANCELAR_CUENTA_APUESTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(realizarSorteo_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CONSULTAR_SALDO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reporteApuestas_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REALIZAR_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CANCELAR_APUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RETIRAR_DINERO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrarApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CARGA_AUTO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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

    public void realizarApuesta(String _numeroCuenta, String tipo, String _numeroApuesta) {
        String numeroCuenta = _numeroCuenta;
        String numeroApuesta = _numeroApuesta;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            switch (tipo) {
                case "A":
                    out.writeUTF("APOSTAR_TIPO_A");
                    out.writeUTF(numeroCuenta);
                    out.writeUTF(numeroApuesta);
                    break;
                case "B":
                    out.writeUTF("APOSTAR_TIPO_B");
                    out.writeUTF(numeroCuenta);
                    out.writeUTF(numeroApuesta);
                    break;
                case "C":
                    out.writeUTF("APOSTAR_TIPO_C");
                    out.writeUTF(numeroCuenta);
                    out.writeUTF(numeroApuesta);
                    break;
            }

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            JOptionPane.showMessageDialog(null, mensaje);
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

    public void realizarSorteo(String _numeroApuesta) {
        // TODO add your handling code here:
        String numeroApuesa = _numeroApuesta;
        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("REALIZAR_SORTEO");
            out.writeUTF(numeroApuesa);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void CANCELAR_CUENTA_APUESTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELAR_CUENTA_APUESTASActionPerformed
        Cancelar_cuenta cah = new Cancelar_cuenta();
        cah.setVisible(true);
    }//GEN-LAST:event_CANCELAR_CUENTA_APUESTASActionPerformed

    private void cerrarApuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarApuestasActionPerformed
        // TODO add your handling code here:
        if (cerrarApuestas.isVisible()) {
            cerrar_Apuestas("CERRAR_APUESTAS");
        }
    }//GEN-LAST:event_cerrarApuestasActionPerformed

    private void CONSULTAR_SALDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTAR_SALDOActionPerformed
        Consultar_saldo tf = new Consultar_saldo();
        tf.setVisible(true);
    }//GEN-LAST:event_CONSULTAR_SALDOActionPerformed

    private void CANCELAR_APUESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELAR_APUESTAActionPerformed
        Cancelar_apuesta cancel = new Cancelar_apuesta();
        cancel.setVisible(true);
    }//GEN-LAST:event_CANCELAR_APUESTAActionPerformed

    private void REALIZAR_APUESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REALIZAR_APUESTAActionPerformed
        JCheckBox chec = new JCheckBox("Prueba");
        if (banderaVal) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de apuesta: ",
                    "Selector de opciones", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                    new Object[]{"Apuesta tipo A (4 cifras).",
                        "Apuesta tipo B (3 cifras).",
                        "Apuesta tipo C (2 cifras)."},
                    "SALIR");
            switch (seleccion) {
                case 0:
                    System.out.println("Apuesta tipo A");
                    ApuestaA ventanaApuestaA = new ApuestaA();
                    ventanaApuestaA.setVisible(true);
                    break;
                case 1:
                    System.out.println("Apuesta tipo B ");
                    ApuestaB ventanaApuestaB = new ApuestaB();
                    ventanaApuestaB.setVisible(true);
                    break;
                case 2:
                    System.out.println("Apuesta tipo C ");
                    ApuestaC ventanaApuestaC = new ApuestaC();
                    ventanaApuestaC.setVisible(true);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Las Apuestas estan Cerradas");
        }
    }//GEN-LAST:event_REALIZAR_APUESTAActionPerformed

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

    private void RETIRAR_DINEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETIRAR_DINEROActionPerformed
        Retirar rt = new Retirar();
        rt.setVisible(true);
    }//GEN-LAST:event_RETIRAR_DINEROActionPerformed

    private void DEPOSITAR_DINEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITAR_DINEROActionPerformed
        Depositar dp = new Depositar();
        dp.setVisible(true);
    }//GEN-LAST:event_DEPOSITAR_DINEROActionPerformed

    private void Abrir_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_cuentaActionPerformed

        Abrir_cuenta_datos acd = new Abrir_cuenta_datos();
        acd.setVisible(true);

    }//GEN-LAST:event_Abrir_cuentaActionPerformed

    private void realizarSorteo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarSorteo_ButtonActionPerformed
        
       // if(!banderaVal){
            Realizar_sorteo realizarSorteo = new Realizar_sorteo();
            realizarSorteo.setVisible(true);
       // }else{
       //    System.out.println("Las Apuestas Estan Abiertas, Por favor cerrar Apuestas para Realizar Sorteo");
       //   JOptionPane.showMessageDialog(this, "Las Apuestas Estan Abiertas, Por favor cerrar Apuestas para Realizar Sorteo");
       // }
        
    }//GEN-LAST:event_realizarSorteo_ButtonActionPerformed

    private void reporteApuestas_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteApuestas_ButtonActionPerformed
        // TODO add your handling code here:
        reporteApuestas("REPORTE");
    }//GEN-LAST:event_reporteApuestas_ButtonActionPerformed
    public void ConsultarS(String cu) {
        String numeroCuenta = cu;
        System.out.println("cuenta" + numeroCuenta);

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CONSULTAR_SALDO");
            out.writeUTF(numeroCuenta);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
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

    public void cerrar_Apuestas(String cu) {
        // TODO add your handling code here:
        String c = cu;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF(c);
            String msg = in.readUTF();
            System.out.println("msg" + msg);
            boolean bandera = Boolean.parseBoolean(msg);
            if (bandera) {
                int respuestaServidor = JOptionPane.showConfirmDialog(this, "No se han registrado apuestas, Desea cerrar las Apuestas?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (respuestaServidor == JOptionPane.YES_OPTION) {
                    banderaVal = false;
                    System.out.println("Apuestas Cerradas");
                    JOptionPane.showMessageDialog(this, "Apuestas Cerradas");
                }
            } else {
                banderaVal = false;
                System.out.println("Apuestas Cerradas");
                JOptionPane.showMessageDialog(this, "Apuestas Cerradas");
            }
            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
     public void reporteApuestas(String dato) {
        // TODO add your handling code here:
        String c = dato;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF(c);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir_cuenta;
    private javax.swing.JButton CANCELAR_APUESTA;
    private javax.swing.JButton CANCELAR_CUENTA_APUESTAS;
    private javax.swing.JButton CARGA_AUTO;
    private javax.swing.JButton CONSULTAR_SALDO;
    private javax.swing.JButton DEPOSITAR_DINERO;
    private javax.swing.JLabel JTF_FECHA;
    private javax.swing.JPanel NULL;
    private javax.swing.JButton REALIZAR_APUESTA;
    private javax.swing.JButton RETIRAR_DINERO;
    private javax.swing.JButton cerrarApuestas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    private javax.swing.JButton realizarSorteo_Button;
    private javax.swing.JButton reporteApuestas_Button;
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
            ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/images.png"));

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
            ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/bet2.jpg"));

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/bet.jpg"));

        return retValue;
    }

}
