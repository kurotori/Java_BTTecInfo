package com.example;

import java.util.Random;

public class Seguridad {

    public String caracteres = "abcdefghijklmnoprstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public int numeroAlAzarEntre(int a, int b) {
        Random r = new Random();
        int numero = r.nextInt(b - a) + a;
        return numero;
    }

    public String crearSal(int longitud) {
        String sal = "";
        for (int i = 0; i < longitud; i++) {
            int letra = numeroAlAzarEntre(0, caracteres.length());
            sal += caracteres.charAt(letra);
        }
        return sal;
    }

    public static void main(String[] args) {
        Seguridad s = new Seguridad();
        for (int i = 0; i < 10; i++) {
            System.out.println(s.crearSal(30));
        }
    }
}
