package com.example.bdd;

import java.sql.*;

public class Conexion {
    private String servidor;
    private int puerto;
    private String basededatos;
    private String usuario;
    private String contrasenia;

    // ctor
    public Conexion(String servidor,
            int puerto,
            String basededatos,
            String usuario,
            String contrasenia) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.basededatos = basededatos;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Connection crearConexion() throws Exception {
        Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://" + servidor + ":" + puerto +
                        "/" + basededatos,
                usuario,
                contrasenia);
        return conexion;
    }
}
