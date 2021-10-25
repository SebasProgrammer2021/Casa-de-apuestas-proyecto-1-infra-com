/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa_apuesta_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rodrigo Acosta Restrepo.
 * @author Juan Sebastián Tobón.
 * @author Sebastián Londoño Valencia.
 */
public class InterfaceTexto {

    //Inicializamos variables para comunicar con el servidor
    //IP del servidor
    static final String HOST = "127.0.0.1";
    //Puerto del servidor
    static final int PUERTO = 5000;
    //Variables para envio y recepcion de mensajes
    static DataInputStream in;
    static DataOutputStream out;

//manejo de datos
    String nombre;
    String apellido;
    String saldo;
   static String ar[] = new String[3];
    
   /**
    * Metodos para autocarga de datos en el programa
    */
    //  -------- Metodo Carga para cargar datos eb ek servidor
       public static void carga(){
    
        
        try {
            //Creo el socket para conectarme con el cliente
            Socket socket = new Socket(HOST, PUERTO);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CARGA");
            
            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            String mensaje1 = in.readUTF();
          
     
            System.out.println("CUENTAS AUTOCARGA" + mensaje + " "+ mensaje1 );

            
            ar[0] = mensaje;
            ar[1] = mensaje1;
           
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
       // -----------  FIN Metodos de carga automatica
    

    // -----------   Metodo para ABRIR CUENTA  ------------
    public static void crearCliente(String nombreRecibido, String apellidoRecibido) {
        //fucncion en el cliente que realiza peticon al server recibiendo datos de la vista abrir cuenta

        try {

            //Creo el socket para conectarme con el servidor
            Socket socket = new Socket(HOST, PUERTO);

            //Se reciben los mensajes del servidor
            in = new DataInputStream(socket.getInputStream());
            //Enviamos mensajes al servidor
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al servidor
            out.writeUTF("ABRIR_CUENTA"); //mensaje al servidor
            out.writeUTF(nombreRecibido + " " + apellidoRecibido); //elemnetos enviados al servidor

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);

            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // ---------  FIN  Metodo para ABRIR CUENTA ---------- 

    // -----------   Metodo para DEPOSITAR DINERO  ------------
    public static void depositarDinero(String numeroCuenta, String valorDepositado) {

        try {
            //Creo el socket para conectarme con el cliente
            Socket socket = new Socket(HOST, PUERTO);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("DEPOSITAR");
            out.writeUTF(numeroCuenta);
            out.writeUTF(valorDepositado);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);

            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // ---------  FIN  Metodo para DEPOSITAR DINERO ---------- 

    // -----------   Metodo para CANCELAR CUENTA  ------------
    public static void cancelarCuenta(String numeroCuenta) {
        try {
            //Creo el socket para conectarme con el cliente
            Socket socket = new Socket(HOST, PUERTO);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CANCELAR_CUENTA");
            out.writeUTF(numeroCuenta);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);

            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // ---------  FIN  Metodo para CANCELAR CUENTA ---------- 

    // -----------   Metodo para RETIRAR DINERO  ------------
    public static void retirarDinero(String numeroCuenta, String valorRetiro) {
        try {
            //Creo el socket para conectarme con el cliente
            Socket socket = new Socket(HOST, PUERTO);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("RETIRAR");
            out.writeUTF(numeroCuenta);
            out.writeUTF(valorRetiro);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);

            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // ---------  FIN  Metodo para RETIRAR DINERO ---------- 

    // -----------   Metodo para CONSULTAR SALDO  ------------
    public static void consultarSaldo(String numeroCuenta) {
        try {
            //Creo el socket para conectarme con el cliente
            Socket socket = new Socket(HOST, PUERTO);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("CONSULTAR");
            out.writeUTF(numeroCuenta);

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);

            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // ---------  FIN  Metodo para CONSULTAR SALDO ---------- 

    // -----------   Metodo para HACER APUESTA  ------------
    public static void hacerApuesta(String numeroCuenta) {

    }
    // ---------  FIN  Metodo para HACER APUESTA ---------- 

    // -----------   Metodo para CANCELAR APUESTA  ------------
    public static void cancelarApuesta(String numeroCuenta) {

    }
    // ---------  FIN  Metodo para CANCELAR APUESTA---------- 

    // -----------   Metodo para CARGA AUTOMATICA  ------------
    public static void cargaAutomatica() {

        System.out.println("\t \t **** CARGA AUTOMATICA ****"
                + " \n \n"
                + " -- ABRIR CUENTA \t \t"
                + " -- DEPOSITAR DINERO \n"
                + " -- CANCELAR CUENTA \t \t"
                + " -- RETIRAR DINERO \n"
                + " -- CONSULTAR SALDO \t \t"
                + " -- HACER APUESTA \n"
                + " -- CANCELAR APUESTA \t \t"
                + " -- CARGA AUTOMATICA \n"
        );

        //MUESTRA POR CONSOLA LAS CUENTAS Y BOLSILLOS
        try {
            //Creo el socket para conectarme con el cliente
            Socket socket = new Socket(HOST, PUERTO);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al cliente
            // out.writeUTF("CANCELAR_CUENTA");
            out.writeUTF("MOSTRAR_HASH");

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje + "n");

            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

        crearCliente("Sandra", "Castaño");
        crearCliente("Pedro", "Garcia"); 

        carga();
        System.out.println("cuentas carga automatica: " + ar[0] + "\n" + ar[1]);

        //esto se hace por que las cuentas las retorna el servidos sin ningun orden
        String cu = ar[0];
        String cu2 = ar[1];
        
        /**
         * Pendiente metodos de crearApuesta y cancelarApuesta
         */

        depositarDinero(cu, "100");
        retirarDinero(cu, "100");
        consultarSaldo(cu);
        cancelarCuenta(ar[0]);
        cancelarCuenta(ar[1]);

    }
    // ---------  FIN  Metodo para CARGA AUTOMATICA---------- 
    
  
    
    
    
    
    /**
     * Metodo MAIN
     * @param args 
     */

    public static void main(String[] args) {
        int desicion = 0;
        do {
            System.out.println("\t \t **** MENU ****"
                    + " \n \n"
                    + "1 -- ABRIR CUENTA \t \t"
                    + "2 -- DEPOSITAR DINERO \n"
                    + "3 -- CANCELAR CUENTA \t \t"
                    + "4 -- RETIRAR DINERO \n"
                    + "5 -- CONSULTAR SALDO \t \t"
                    + "6 -- HACER APUESTA \n"
                    + "7 -- CANCELAR APUESTA \t \t"
                    + "8 -- CARGA AUTOMATICA \n"
                    + "\t 9 -- **** CERRAR ****"
            );

            System.out.println("Ingrese una opcion");

            Scanner entradaScaner = new Scanner(System.in);
            desicion = Integer.parseInt(entradaScaner.nextLine());

            System.out.println("Presiono: \t" + desicion);

            switch (desicion) {
                case 1:  // 1 -- ABRIR CUENTA
                    System.out.println("\t ABRIR CUENTA");
                    System.out.println("Ingrese nombre: ");
                    String nombre = entradaScaner.nextLine();
                    System.out.println("Ingrese apellido");
                    String apellido = entradaScaner.nextLine();
                    crearCliente(nombre, apellido);
                    break;

                case 2: // 2 -- DEPOSITAR DINERO
                    System.out.println("\t DEPOSITAR DINERO");
                    System.out.println("Ingrese numero de cuenta: ");
                    String numeroCuenta = entradaScaner.nextLine();
                    System.out.println("Ingrese valor a depositar: ");
                    String valorDepositar = entradaScaner.nextLine();
                    depositarDinero(numeroCuenta, valorDepositar);
                    break;

                case 3:// 3 -- CANCELAR CUENTA
                    System.out.println("\t CANCELAR CUENTA");
                    System.out.println("Ingrese numero de cuenta: ");
                    String numeroCuentaCancelar = entradaScaner.nextLine();
                    cancelarCuenta(numeroCuentaCancelar);
                    break;
                case 4:// 4 -- RETIRAR DINERO
                    System.out.println("\t RETIRAR DINERO");
                    System.out.println("Ingrese numero de cuenta: ");
                    String numeroCuentaC = entradaScaner.nextLine();
                    System.out.println("Ingrese valor a retirar: ");
                    String valorRetiro = entradaScaner.nextLine();
                    retirarDinero(numeroCuentaC, valorRetiro);
                    break;
                case 5: // 5 -- CONSULTAR SALDO
                    System.out.println("\t CONSULTAR SALDO");
                    System.out.println("Ingrese numero de cuenta: ");
                    String numeroCuentaConsultar = entradaScaner.nextLine();
                    consultarSaldo(numeroCuentaConsultar);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8: // 8 -- CARGA AUTOMATICA 
                    cargaAutomatica();
                    break;
                default:
                    break;

            }

        } while (desicion != 9);

        System.out.println("Cierre");

    }

}
