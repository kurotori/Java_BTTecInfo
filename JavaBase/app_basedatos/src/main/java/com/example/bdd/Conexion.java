package com.example.bdd;

import java.sql.*;

public class Conexion {

    private String usuario;
    private String contrasenia;
    private String basededatos;
    private String servidor;
    private int puerto;

    public Conexion(
            String usuario,
            String contrasenia,
            String basededatos,
            String servidor,
            int puerto) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.basededatos = basededatos;
        this.servidor = servidor;
        this.puerto = puerto;
    }

    public Connection crearConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://" + basededatos,
                    usuario,
                    contrasenia);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return conexion;
    }

}
