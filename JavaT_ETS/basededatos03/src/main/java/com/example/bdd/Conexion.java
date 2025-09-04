package com.example.bdd;

import java.sql.*;

public class Conexion {
    private String servidor;
    private int puerto;
    private String base;
    private String usuario;
    private String contrasenia;

    public Conexion(String servidor,
            int puerto,
            String base,
            String usuario,
            String contrasenia) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.base = base;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Connection crearConexion()
            throws Exception {
        Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://" + servidor +
                        ":" + puerto + "/" + base,
                usuario,
                contrasenia);
        return conexion;
    }

}
