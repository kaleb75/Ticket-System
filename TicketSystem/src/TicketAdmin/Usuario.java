/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicketAdmin;

/**
 *
 * @author IMX078856
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private int admin;
    private int numeroReloj;
    private String departamento;
    private int systemAdmin;

    public Usuario(String nombre, String apellido, String usuario, String contrasena, int admin, int numeroReloj, String departamento, int systemAdmin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.admin = admin;
        this.numeroReloj = numeroReloj;
        this.departamento = departamento;
        this.systemAdmin = systemAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getAdmin() {
        return admin;
    }

    public int getNumeroReloj() {
        return numeroReloj;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getSystemAdmin() {
        return systemAdmin;
    }

    public boolean isAdmin() {
        return admin == 1;
    }

    public boolean isSystemAdmin() {
        return systemAdmin == 1;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}

