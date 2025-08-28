package com.example;

import java.sql.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String consulta = "select version()";

        try {

            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306",
                    "estudiante",
                    "estudiantes");
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            while (resultado.next()) {
                JOptionPane.showMessageDialog(
                        null,
                        resultado.getString(1));
            }
            resultado.close();
            sentencia.close();
            conexion.close();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERROR:" + error.getMessage());
        }

    }
}