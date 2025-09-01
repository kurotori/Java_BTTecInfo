package com.example.bdd;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {

    private String usuario;
    private String contrasenia;
    private String basededatos;
    private String servidor;
    private int puerto;

    private String urlServidor;

    /**
     * Permite establecer los datos para una conexión a una base de datos
     * específica en el servidor inidicado.
     * 
     * @param usuario
     * @param contrasenia
     * @param basededatos
     * @param servidor
     * @param puerto
     */
    public Conexion(
            String servidor,
            int puerto,
            String basededatos,
            String usuario,
            String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.basededatos = basededatos;
        this.servidor = servidor;
        this.puerto = puerto;

        this.urlServidor = "jdbc:mysql://" + servidor + ":" + puerto + "/" + basededatos;
    }

    /**
     * Permite establecer los datos para una conexión al servidor de bases de datos
     * 
     * @param usuario
     * @param contrasenia
     * @param servidor
     * @param puerto
     */
    public Conexion(
            String servidor,
            int puerto,
            String usuario,
            String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.basededatos = "";
        this.servidor = servidor;
        this.puerto = puerto;

        this.urlServidor = "jdbc:mysql://" + servidor + ":" + puerto;
    }

    /**
     * Permite generar una conexión activa con un servidor de bases de datos.
     * 
     * @return La conexión activa
     */
    public Connection crearConexion() throws Exception {
        Connection conexion = DriverManager.getConnection(
                urlServidor,
                usuario,
                contrasenia);
        return conexion;
    }

    /**
     * Muestra un diálogo indicando el estado de la conexión
     */
    public boolean probarConexion() {
        boolean estado = false;
        String mensaje;
        try {
            Connection conexion = crearConexion();
            mensaje = "Conectado con éxito\nServidor: " + servidor + "\nPuerto: " + puerto +
                    "\nBase de datos: " + basededatos;
            estado = true;
            conexion.close();
        } catch (Exception e) {
            mensaje = "Error de conexión:\n" + e.getMessage();
        }
        JOptionPane.showMessageDialog(null, mensaje);

        return estado;
    }

}
