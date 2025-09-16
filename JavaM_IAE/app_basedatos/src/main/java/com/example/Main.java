package com.example;

import com.example.bdd.Conexion;

public class Main {
    public static void main(String[] args) {
        Conexion c = new Conexion("localhost", 3306, "estudiante", "estudiantes");
        c.probarConexion();
    }
}