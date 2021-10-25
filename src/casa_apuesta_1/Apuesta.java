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
public class Apuesta {
    
    private String tipoApuesta;
    private int numeroApuesta;

    public Apuesta(String tipoApuesta, int numeroApuesta) {
        this.tipoApuesta = tipoApuesta;
        this.numeroApuesta = numeroApuesta;
    }

    public String getTipoApuesta() {
        return tipoApuesta;
    }

    public int getNumeroApuesta() {
        return numeroApuesta;
    }
    
    public void setTipoApuesta(String tipoApuesta) {
        this.tipoApuesta = tipoApuesta;
    }

    public void setNumeroApuesta(int numeroApuesta) {
        this.numeroApuesta = numeroApuesta;
    }
    
    
    
    
}
