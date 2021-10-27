/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa_apuesta_1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
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
    //Variables para almacenar numero de cuentas
    static ArrayList<String> numerosCuentas = new ArrayList<String>();
    static Integer contador1 = 0;
    static Integer contador2 = 0;
    

    /**
     * Metodos para autocarga de datos en el programa
     */
    //  -------- Metodo Carga para cargar datos eb ek servidor
    public static void carga() {

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

            System.out.println("CUENTAS AUTOCARGA" + mensaje + " " + mensaje1);

            ar[0] = mensaje;
            ar[1] = mensaje1;

            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // -----------  FIN Metodos de carga automatica
    // -----------   Metodo para ABRIR CUENTA  ------------
    public static String crearCliente(String nombreRecibido, String apellidoRecibido) {
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

            // creamos variable para el retorno de la informacion
            String datos = nombreRecibido + " " + apellidoRecibido;

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            
            //Guardamos datos de la cuenta
            numerosCuentas.add(in.readUTF());

            socket.close();
            return datos;

        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    // ---------  FIN  Metodo para ABRIR CUENTA ---------- 

    // -----------   Metodo para DEPOSITAR DINERO  ------------
    public static String depositarDinero(String numeroCuenta, String valorDepositado) {

        try {
            //Creo el socket para conectarme con el cliente
            Socket socket = new Socket(HOST, PUERTO);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF("DEPOSITAR");
            out.writeUTF(numeroCuenta);
            out.writeUTF(valorDepositado);

            String datos = numeroCuenta + " " + valorDepositado;

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();
            System.out.println(mensaje);

            socket.close();
            return datos;
        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
    public static String hacerApuesta(String numeroCuenta, String tipo, String numeroApuesta) {

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
            System.out.println(mensaje);

            String datos = numeroCuenta + " " + " " + tipo + " " + numeroApuesta;
            sc.close();
            return datos;
        } catch (IOException ex) {
            Logger.getLogger(Cajero_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    // ---------  FIN  Metodo para HACER APUESTA ---------- 

    // ---------  INICIO  Metodo para validar letra en tipo de apuesta ---------- 
    public static boolean validarLetraTipoApuesta(String tipoApuesta) {
        String tipo = tipoApuesta.toUpperCase();
        if (tipo.equalsIgnoreCase("a") || tipo.equalsIgnoreCase("b") || tipo.equalsIgnoreCase("c")) {
            return true;
        }
        return false;
    }
    // ---------  FIN  Metodo para validar letra en tipo de apuesta  ---------- 

    // -----------   Metodo para CANCELAR APUESTA  ------------
    public static void cerrarApuestas(String numeroCuenta) {

    }
    // ---------  FIN  Metodo para CANCELAR APUESTA---------- 

    // -----------   Metodos para CARGA AUTOMATICA  ------------
    
    public static void subirArchivo() throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        File archivo = new File("./src/casa_apuesta_1/recursos/cargueAuto.txt");

        String cadenaArchivo;
        String respuesta = "";
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        while ((cadenaArchivo = br.readLine()) != null) {

            respuesta += separarArchivo(cadenaArchivo);
            System.out.println(cadenaArchivo);
        }
        br.close();
    }

    public static String separarArchivo(String cadenaArchivo) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        String respuesta = "";
        String datos[] = cadenaArchivo.split(",");
        switch (datos[0]) {
            case "CREAR_CUENTA":
                respuesta = crearCliente(datos[1], datos[2]);
                break;

            case "DEPOSITAR":
                respuesta = depositarDinero(numerosCuentas.get(contador1), datos[1]);
                contador1++;
                break;

            case "APOSTAR":
                respuesta = hacerApuesta(numerosCuentas.get(contador2), datos[1], datos[2]);
               contador2++;
                break;

        }

        return respuesta;
    }
    
    // ---------  FIN  Metodo para CARGA AUTOMATICA---------- 


    /**
     * Metodo MAIN
     *
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
                    + "7 -- CERRAR APUESTAS \t \t"
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
                case 6: // 6 -- HACER APUESTA
                    System.out.println("\t HACER APUESTA");
                    System.out.println("Ingrese numero de cuenta: ");
                    String numeroCuentaH = entradaScaner.nextLine();
                    System.out.println("Ingrese tipo de apuesta: \n A (4 cifras) \t B (3 cifras) \t C (2 cifras)");
                    String tipoApuesta = entradaScaner.nextLine();
                    int count = 0;
                    while (!validarLetraTipoApuesta(tipoApuesta)) {
                        System.out.println("Tipo no valido, Ingrese tipo de apuesta: \n A (4 cifras) \t B (3 cifras) \t C (2 cifras)");
                        String tipoApuestaIf = entradaScaner.nextLine();
                        if (validarLetraTipoApuesta(tipoApuestaIf)) {
                            tipoApuesta = tipoApuestaIf;
                            break;
                        }
                    }

                    System.out.println("Ingrese numero de apuesta: ");
                    String numeroApuesta = entradaScaner.nextLine();
                    hacerApuesta(numeroCuentaH, tipoApuesta.toUpperCase(), numeroApuesta);
                    break;
                case 7:
                    break;
                case 8: 
                    try {
                    // 8 -- CARGA AUTOMATICA
                    subirArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(InterfaceTexto.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;

                default:
                    break;

            }

        } while (desicion != 9);

        System.out.println("Cierre");

    }

}
