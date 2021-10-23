package casa_apuesta_1;

import javax.swing.JOptionPane;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Random;
// Import the HashMap class
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;

/**
 *
 * @author Santiago Martinez Ayala
 */
public class Servidor {

    public static void main(String[] args) {

        //FECHA
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        String fecha = "Fecha: " + dtf5.format(LocalDateTime.now());

        // Create a HashMap object called cuentas
        HashMap<String, String> CuentasApuestas = new HashMap<String, String>();

        //saldo cuenta
        HashMap<String, Integer> saldoCuentas = new HashMap<String, Integer>();
        //almacenar fecha
        HashMap<String, String> fechatrans = new HashMap<String, String>();

        //DATOS APUESTA
        HashMap<String, Integer> apuesta = new HashMap<String, Integer>();

        //arrancar vista cliente despues del server
        Cajero_interface.main(new String[0]);

        ServerSocket servidor = null;     ///el servidor siempre esta escuchando
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        //puerto de nuestro servidor
        final int PUERTO = 5000;

        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            System.out.println("*************Servidor iniciado***************");
            //JOptionPane.showImputDialog(null,"s");
            //Siempre estara escuchando peticiones
            while (true) {

                //Espero a que un cliente se conecte
                sc = servidor.accept();

                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                //Leo el mensaje que me envia el cliente
                String mensaje = in.readUTF();

                //si el mensaje del cliente es este se ejecuta esta orden de comandos
//--------------------------------------ABRIR CUENTA PARA APUESTAS---------------------------------------------------------
                if ("ABRIR_CUENTA".equals(mensaje)) {
                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String nombreCliente = in.readUTF();

                        //muestra datos de cliente
                        System.out.println(nombreCliente);

                        //generar numero de cuenta ramdon comenzando por 1
                        Random random = new Random();
                        int randomNumber = (random.nextInt(955369));//int randomNumber = (random.nextInt(955369)); se crea una cuenta con  saldo en 0 y un numeto de cuenta ramdon que inica en 1
                        String cuenta = "1" + Integer.toString(randomNumber);

                        //guardo en hashmap
                        if (!CuentasApuestas.containsKey(nombreCliente)) {
                            CuentasApuestas.put(nombreCliente, cuenta);  //LLENAMOS LOS HASHMAP CON LA CLAVE DE CUENTA 
                            saldoCuentas.put(cuenta, 0);
                            fechatrans.put(cuenta, fecha);

                            //Le envio un mensaje y # de cuenta 
                            out.writeUTF("Cuenta creada con #" + cuenta + " A nombre de: " + nombreCliente);   //DEVOLVEMOS MENSAJE AL CLIENTE
                            System.out.println("Cuenta creada con exito");
                        } else {
                            System.out.println("este nombre ya esta, error al crear cuenta");
                            out.writeUTF("El usuario " + nombreCliente + " ya esta registrado");

                        }

                    } catch (IOException ex) {
                        System.out.println(ex);
                        out.writeUTF("¡transacción erronea");
                    }
                }
                //-------------------------FINALIZACION DEL PROCESO DE CREAR CUENTA PARA APUESTAS------------------------------------------

//---------------------------------------DEPOSITAR PLATA CUENTA-----------------------------------------------------
                switch (mensaje) {
                    case "DEPOSITAR":
                        try {
                            System.out.println("servidor recibe: " + mensaje);
                            //recibe datos de cliente en cuenta
                            String cu = in.readUTF();
                            String va  = in.readUTF();
                            System.out.println(cu + va);

                            //muestra datos de cliente
                            System.out.println(cu + "servidor");

                            if (CuentasApuestas.containsValue(cu) && saldoCuentas.containsKey(cu)) {
                                System.out.println("si existe cuenta");
                                saldoCuentas.put(cu, saldoCuentas.get(cu) + Integer.parseInt(va));
                                out.writeUTF("DEPOSITO REALIZADO: Se depositaron " + va  + " a la cuenta: " + cu);
                            } else {
                                out.writeUTF("Cuenta: " + cu + " no existente");
                            }
                        } catch (IOException ex) {
                            out.writeUTF("¡transacción erronea");
                            System.out.println(ex);
                        }
                    break;
                }
//----------------------------------------PROCESO DE DEPOSITO FINALIZADO-------------------------------------------------------                     

//---------------------------------------RETIRAR DINERO---------------------------------------------------------------------------
                if ("RETIRAR".equals(mensaje)) {
                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cu = in.readUTF();
                        String va  = in.readUTF();
                        System.out.println(cu + va);

                        //muestra datos de cliente
                        System.out.println(cu + "servidor");

                        if (CuentasApuestas.containsValue(cu) && saldoCuentas.containsKey(cu)) {
                            System.out.println("si existe cuenta");
                            for (String s : saldoCuentas.keySet()) {
                                if (s.equals(cu) && saldoCuentas.get(s) >= Integer.parseInt(va)) {
                                    int saldo = saldoCuentas.get(s) - Integer.parseInt(va);
                                    saldoCuentas.put(cu, saldo);
                                    out.writeUTF("Retirar valor  " + va  + " Cuenta: " + cu);
                                } else {
                                    out.writeUTF("Fondos insuficientes... ");
                                }
                            }

                        } else {
                            out.writeUTF("Cuenta: " + cu + " no existente");
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                }

//-------------------------------------FINALIZA EL PROCESO DE RETIRAR DINERO-----------------------------------------------------                    
//----------------------------------------------CANCELAR CUENTA-------------------------------------------------------------
                if ("CANCELAR_CUENTA".equals(mensaje)) {
                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cc = in.readUTF();

                        //muestra datos de cliente
                        System.out.println(cc + "servidor");

                        //VALIDAR SALDO
                        boolean sal = false;
                        for (String f : CuentasApuestas.keySet()) {
                            for (String saldo : saldoCuentas.keySet()) {
                                if (CuentasApuestas.get(f).equals(cc)) {
                                    int sa = saldoCuentas.get(saldo);
                                    if (sa != 0) {
                                        out.writeUTF("RETIRE EL SALDO PARA ELIMINAR SALDO: " + sa + " " + CuentasApuestas.get(f));
                                        sal = true;
                                    }
                                }
                            }
                        }

                        if (CuentasApuestas.containsValue(cc) && sal != true) {
                            System.out.println("si existe");

                            if (!apuesta.containsKey(cc)) {

                                //ELIMINAR CUENTA
                                //ITERADOR PARA FUNCIONES DE BORRADO SIN LA KEY 
                                Iterator<HashMap.Entry<String, String>> iter = CuentasApuestas.entrySet().iterator();
                                while (iter.hasNext()) {
                                    Map.Entry<String, String> entry = iter.next();
                                    if (cc.equalsIgnoreCase(entry.getValue())) {
                                        iter.remove();
                                        System.out.println("entre al while");
                                        out.writeUTF("La cuenta ha sido eliminada : " + cc);
                                    }
                                }
                            } else {
                                System.out.println("Tiene apuesta");
                                out.writeUTF("La cuenta esta vinculada a una apuesta no se puede eliminar.");
                            }
                        } else {
                            out.writeUTF("Cuenta: " + cc + " no existente");
                        }

                    } catch (IOException ex) {
                        System.out.println(ex);

                    }

                }

//---------------------------------------FINALIZACION DEL PROCESO DE CANCELAR CUENTA--------------------------------------               
//----------------------------------------------APUESTA DE TIPO A-----------------------------------------------------------  
                if ("APOSTAR_TIPO_A".equals(mensaje)) {
                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cuo = in.readUTF();
                        //String cud = in.readUTF();
                        String va  = in.readUTF();
                        System.out.println(cuo + va);

                        //muestra datos de cliente
                        System.out.println(cuo + "servidor");

                        if (CuentasApuestas.containsValue(cuo) && saldoCuentas.containsKey(cuo) && apuesta.containsKey(cuo)) {
                            System.out.println("si existe cuenta cuo");

                            //descontar de la cuenta de origen
                            for (String s : saldoCuentas.keySet()) {
                                if (s.equals(cuo) && saldoCuentas.get(s) >= Integer.parseInt(va)) {
                                    int saldo = 0;
                                    saldo = saldoCuentas.get(s) - Integer.parseInt(va);
                                    System.out.println(saldoCuentas.get(s));
                                    saldoCuentas.put(cuo, saldo);
                                    System.out.println("saldo****** " + saldo);

                                    //int numEntero = Integer.parseInt(va);
                                    //int aux = Integer.toString(numEntero).length();
                                    if (va.length() == 4) {
                                        apuesta.put(cuo, apuesta.get(cuo) + Integer.parseInt(va));
                                        out.writeUTF("Apuesta tipo A es EXITOSA #" + cuo + " valor: " + va);
                                    } else {
                                        out.writeUTF("NUMERO APUESTA INVALIDA");
                                        System.out.println("NUMERO APUESTA INVALIDA");
                                    }
                                } else {
                                    out.writeUTF("FONDOS INSUFICIENTES");
                                }
                            }

                        } else {
                            out.writeUTF("ESTA CUENTA NO TIENE APUESTA CREE UNA" + cuo);
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                }
//-------------------------------FINALIZACION DEL PROCESO DE APUESTA DE TIPO A----------------------------------------------------------                    

//------------------------------------------APUESTA DE TIPO B--------------------------------------------------------
                if ("APOSTAR_TIPO_B".equals(mensaje)) {
                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cuo = in.readUTF();
                        //String cud = in.readUTF();
                        String va  = in.readUTF();
                        System.out.println(cuo + va);

                        //muestra datos de cliente
                        System.out.println(cuo + "servidor");

                        if (CuentasApuestas.containsValue(cuo) && saldoCuentas.containsKey(cuo) && apuesta.containsKey(cuo)) {
                            System.out.println("si existe cuenta cuo");

                            //descontar de la cuenta de origen
                            for (String s : saldoCuentas.keySet()) {
                                if (s.equals(cuo) && saldoCuentas.get(s) >= Integer.parseInt(va)) {
                                    int saldo = 0;
                                    saldo = saldoCuentas.get(s) - Integer.parseInt(va);
                                    System.out.println(saldoCuentas.get(s));
                                    saldoCuentas.put(cuo, saldo);
                                    System.out.println("saldo****** " + saldo);

                                    //int numEntero = Integer.parseInt(va);
                                    //int aux = Integer.toString(numEntero).length();
                                    if (va.length() == 3) {
                                        apuesta.put(cuo, apuesta.get(cuo) + Integer.parseInt(va));
                                        out.writeUTF("Apuesta tipo B es EXITOSA #" + cuo + " valor: " + va);
                                    } else {
                                        out.writeUTF("NUMERO APUESTA INVALIDA");
                                        System.out.println("NUMERO APUESTA INVALIDA");
                                    }
                                } else {
                                    out.writeUTF("FONDOS INSUFICIENTES");
                                }
                            }

                        } else {
                            out.writeUTF("ESTA CUENTA NO TIENE APUESTA CREE UNA" + cuo);
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                }
//-------------------------------FINALIZACION DEL PROCESO DE APUESTA DE TIPO B----------------------------------------------------------                    

//------------------------------------------APUESTA DE TIPO C-------------------------------------------------------------
                if ("APOSTAR_TIPO_C".equals(mensaje)) {
                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cuo = in.readUTF();
                        //String cud = in.readUTF();
                        String va  = in.readUTF();
                        System.out.println(cuo + va);

                        //muestra datos de cliente
                        System.out.println(cuo + "servidor");

                        if (CuentasApuestas.containsValue(cuo) && saldoCuentas.containsKey(cuo) && apuesta.containsKey(cuo)) {
                            System.out.println("si existe cuenta cuo");

                            //descontar de la cuenta de origen
                            for (String s : saldoCuentas.keySet()) {
                                if (s.equals(cuo) && saldoCuentas.get(s) >= Integer.parseInt(va)) {
                                    int saldo = 0;
                                    saldo = saldoCuentas.get(s) - Integer.parseInt(va);
                                    System.out.println(saldoCuentas.get(s));
                                    saldoCuentas.put(cuo, saldo);
                                    System.out.println("saldo****** " + saldo);
                                    //int numEntero = Integer.parseInt(va);
                                    //int aux = Integer.toString(numEntero).length();
                                    if (va.length() == 2) {
                                        apuesta.put(cuo, apuesta.get(cuo) + Integer.parseInt(va));
                                        out.writeUTF("Apuesta tipo C es EXITOSA #" + cuo + " valor: " + va);
                                    } else {
                                        out.writeUTF("NUMERO APUESTA INVALIDA");
                                        System.out.println("NUMERO APUESTA INVALIDA");
                                    }
                                } else {
                                    out.writeUTF("FONDOS INSUFICIENTES");
                                }
                            }

                        } else {
                            out.writeUTF("ESTA CUENTA NO TIENE APUESTA CREE UNA" + cuo);
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                }
//-------------------------------FINALIZACION DEL PROCESO DE APUESTA DE TIPO C----------------------------------------------------------                    

//-----------------------------------------CONSULTAR DATOS ACTUALES-------------------------------------------------
//si el mensaje del cliente es este se ejecuta esta orden de comandos
                if ("CONSULTAR_DATOS_ACTUALES".equals(mensaje)) {

                    System.out.println(mensaje);
                    out.writeUTF(" ");
                    System.out.println("CUENTAS********");
                    for (String i : CuentasApuestas.keySet()) {
                        for (String f : fechatrans.keySet()) {
                            for (String s : saldoCuentas.keySet()) {
                                if (CuentasApuestas.get(i).equals(f)) {
                                    if (CuentasApuestas.get(i).equals(s)) {
                                        System.out.println("Nombre: " + i + " Cuenta: " + CuentasApuestas.get(i) + " Saldo: " + saldoCuentas.get(s) + " " + fechatrans.get(f));
                                    }

                                }
                            }

                        }
                    }
                    System.out.println("APUESTAS*********");
                    for (String i : apuesta.keySet()) {
                        System.out.println("cuenta: " + i + "b" + " saldo: " + apuesta.get(i));
                        //out.writeUTF("Nombre: " + i + " Cuenta: " + CuentasAHORRO.get(i)+" " + fechatrans.get(f));

                    }
                }
//-------------------------------------------FINALIZACION DEL PROCESO DE CONSULTA------------------------------------------

//----------------------------------------------------ABRIR SORTEO-------------------------------------------------------------
//!!!!!!!!!!!NOTA: ORGANIZAR Y TRABAJAR ESTE PROCESO          
                if ("ABRIR_SORTEO".equals(mensaje)) {

                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String datoSortep = in.readUTF();

                        //muestra datos de cliente
                        System.out.println(datoSortep);

                        if (CuentasApuestas.containsValue(datoSortep)) {

                            if (!apuesta.containsKey(datoSortep)) {
                                System.out.println("si existe");

                                apuesta.put(datoSortep, 0);

                                out.writeUTF("SORTEO CREADO CON EXITO, NUMERO : " + datoSortep + " SALDO: " + "0");

                            } else {
                                System.out.println("sorteo realizado*********");
                                out.writeUTF(datoSortep + " Esta cuenta ya cuenta con un sorteo");

                            }

                        } else {
                            out.writeUTF("Cuenta: " + datoSortep + " no existente");
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                }
//------------------------------------FINALIZACION PROCESO DE SORTEO------------------------------------------------- 

//-----------------------------------------------CANCELAR APUESTA------------------------------------------------------------
                if ("CANCELAR_APUESTA".equals(mensaje)) {

                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cc = in.readUTF();

                        //muestra datos de cliente
                        System.out.println(cc + "servidor");

                        if (apuesta.containsKey(cc)) {
                            System.out.println("si existe");
                            apuesta.remove(cc);
                            out.writeUTF("APUESTA ELIMINADA : " + cc);

                        } else {
                            out.writeUTF("Cuenta: " + cc + " no existente");
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                }
//--------------------------------------------FINALIZACION PROCESO DE CANCELAR APUESTA---------------------------------               

//--------------------------------------------CONSULTAR SALDO CUENTA----------------------------------------------
                if ("CONSULTAR".equals(mensaje)) {

                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cu = in.readUTF();

                        System.out.println(cu);

                        //muestra datos de cliente
                        System.out.println(cu + "servidor");

                        if (CuentasApuestas.containsValue(cu) && saldoCuentas.containsKey(cu)) {
                            System.out.println("si existe cuenta");
                            for (String s : saldoCuentas.keySet()) {
                                if (s.equals(cu)) {
                                    out.writeUTF("Su saldo es de: " + saldoCuentas.get(s) + " Cuenta: " + cu);
                                } else {
                                    out.writeUTF("ERROR DE CUENTA: ");
                                }
                            }

                        } else {
                            out.writeUTF("Cuenta: " + cu + " no existente");
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                }

//-----------------------------------FINALIZACION DEL PROCESO DE CONSULTA---------------------------------------------                
//----------------------------------------CONSULTAR APUESTA-----------------------------------------------
//!!!!!!!NOTA:PROCESO SOBRANTE
                if ("CONSULTAR_APUESTA".equals(mensaje)) {

                    try {
                        System.out.println("servidor recibe: " + mensaje);
                        //recibe datos de cliente en cuenta
                        String cu = in.readUTF();

                        System.out.println(cu);

                        //muestra datos de cliente
                        System.out.println(cu + "servidor");

                        if (apuesta.containsKey(cu)) {
                            System.out.println("si existe cuenta");
                            for (String s : apuesta.keySet()) {
                                if (s.equals(cu)) {
                                    out.writeUTF("SU SALDO VALOR: " + apuesta.get(s) + " Cuenta apuesta: " + cu);
                                }
                            }

                        } else {
                            out.writeUTF("Apuesta: " + cu + " no existente");
                        }

                    } catch (IOException ex) {
                        out.writeUTF("¡transacción erronea");
                        System.out.println(ex);

                    }

                    System.out.println(mensaje);
                    out.writeUTF(" ");
                    System.out.println("CUENTAS********");
                    for (String i : CuentasApuestas.keySet()) {
                        for (String f : fechatrans.keySet()) {
                            for (String s : saldoCuentas.keySet()) {
                                if (CuentasApuestas.get(i).equals(f)) {
                                    if (CuentasApuestas.get(i).equals(s)) {
                                        System.out.println("Nombre: " + i + " Cuenta: " + CuentasApuestas.get(i) + " Saldo: " + saldoCuentas.get(s) + " " + fechatrans.get(f));
                                    }

                                }
                            }

                        }
                    }
                    System.out.println("APUESTAS*********");
                    for (String i : apuesta.keySet()) {
                        System.out.println("cuenta: " + i + "b" + " saldo: " + apuesta.get(i));
                        //out.writeUTF("Nombre: " + i + " Cuenta: " + CuentasAHORRO.get(i)+" " + fechatrans.get(f));

                    }

                }
//-------------------------------------------------FINALIZACION---------------------------------------------------                

//--------------------------------------------------MOSTRAR LOS HASH MAP-------------------------------------------
                if ("MOSTRAR_HASH".equals(mensaje)) {

                    System.out.println(mensaje);
                    out.writeUTF(" ");
                    System.out.println("CUENTAS********");
                    for (String i : CuentasApuestas.keySet()) {
                        for (String f : fechatrans.keySet()) {
                            for (String s : saldoCuentas.keySet()) {
                                if (CuentasApuestas.get(i).equals(f)) {
                                    if (CuentasApuestas.get(i).equals(s)) {
                                        System.out.println("Nombre: " + i + " Cuenta: " + CuentasApuestas.get(i) + " Saldo: " + saldoCuentas.get(s) + " " + fechatrans.get(f));
                                    }

                                }
                            }

                        }
                    }
                    System.out.println("APUESTAS*********");
                    for (String i : apuesta.keySet()) {
                        System.out.println("cuenta: " + i + "b" + " saldo: " + apuesta.get(i));
                        //out.writeUTF("Nombre: " + i + " Cuenta: " + CuentasAHORRO.get(i)+" " + fechatrans.get(f));

                    }
                }
                if ("CARGA".equals(mensaje)) {

                    System.out.println(mensaje);
                    for (String c : CuentasApuestas.keySet()) {

                        System.out.println("casa_apuesta_1.Servidor.main()  " + CuentasApuestas.get(c));
                        //"ejercicio_sockets_ddr_1.Servidor.main()  "
                        while (c != null) {
                            out.writeUTF(CuentasApuestas.get(c));
                            break;
                        }

                    }

                }
//-------------------------------------------------FINALIZACION---------------------------------------------------
                //Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");

            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
