/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herlpers;

/**
 *
 * @author Sebastian
 */
public class Helper {

    public static void validarLongNumCuenta(java.awt.event.KeyEvent evt, int numeroCuenta) {
        // TODO add your handling code here:
        if (numeroCuenta > 6) {
            evt.consume();
        }
    }
}
