package com.example.bdd;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {

    private String servidor;
    private int puerto;
    private String basededatos;
    private String usuario;
    private String constrasenia;

    /**
     * Crea un objeto para gestionar conexiones a bases de datos
     * de MySQL/MariaDB
     * 
     * @param servidor
     * @param puerto
     * @param basededatos
     * @param usuario
     * @param constrasenia
     */
    public Conexion(
            String servidor,
            int puerto,
            String basededatos,
            String usuario,
            String constrasenia) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.basededatos = basededatos;
        this.usuario = usuario;
        this.constrasenia = constrasenia;
    }

    /**
     * Permite crear una conexion a la base de datos especificada
     * en el constructor
     * 
     * @return la conexión activa a la base de datos
     * @throws Exception
     */
    public Connection crearConexion() throws Exception {
        Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://" + servidor + ":" + puerto + "/" + basededatos,
                usuario,
                constrasenia);
        return conexion;
    }

    public void probarConexion() {
        String resultado = "";
        try {
            crearConexion();
            resultado = "OK";
        } catch (Exception error) {
            resultado = "ERROR: " + error.getMessage();
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
