package com.example;

import com.example.bdd.Conexion;

public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion(
                "localhost", 3306,
                "sistemaJ",
                "estudiante", "estudiantes");
        conexion.probarConexion();
    }
}