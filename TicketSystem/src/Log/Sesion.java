/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Log;

import javax.swing.JOptionPane;

/**
 *
 * @author IMX078856
 */
public class Sesion {
    private static String usuarioActual;

    public static void setUsuarioActual(String usuario) {
        usuarioActual = usuario;
    }

    public static String getUsuarioActual() {
        return usuarioActual;
    }
        public static void cerrarSesion() {
        String mensaje = null;
            
            try {
            Thread.sleep(3000);
            JOptionPane.showMessageDialog(null,"The session has been closed for:  " + usuarioActual);  
        } catch (InterruptedException e) {
            // Manejo de excepciones en caso de interrupción
        }
        usuarioActual = null;
    }
}