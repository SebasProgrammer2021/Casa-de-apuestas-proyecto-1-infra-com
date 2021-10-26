/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa_apuesta_1;

/**
 *
 * @author Rodrigo Acosta Restrepo.
 * @author Juan Sebastián Tobón.
 * @author Sebastián Londoño Valencia.
 */
public class CasaApuesta {

    private int saldo = 0;
    private String nombre;
    private String ubicacion;

    public CasaApuesta(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
