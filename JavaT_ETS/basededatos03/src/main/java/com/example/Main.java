package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.bdd.Conexion;
import com.example.sistema.Usuario;

public class Main {
    public static void main(String[] args) {
        String servidor = "localhost";
        int puerto = 3306;
        String base = "sistemaJ";
        String usuario = "estudiante";
        String password = "estudiante";

        // ArrayList<>

        String consulta = "select id,nombre,apellido,email,fecha_registro from usuarios";

        Conexion conexion = new Conexion(servidor, puerto, base, usuario, password);

        try {
            Connection c = conexion.crearConexion();
            Statement sentencia = c.createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            while (resultado.next()) {

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}