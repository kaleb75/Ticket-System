/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Log;

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
}

