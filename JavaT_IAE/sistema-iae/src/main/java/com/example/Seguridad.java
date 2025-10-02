package com.example;

import java.util.Random;

public class Seguridad {

    private String caracteres = "abcdefghiklmnñopqrstuvwxyzABCDEFGHIKLMNÑOPQRSTUVWXYZ123456789!#$%&/()=?¡";

    public int alAzarEntre(int a, int b) {
        Random r = new Random();
        int numero = r.nextInt(b - a) + a;
        return numero;
    }

    public String crearSal(int longitud) {
        String sal = "";
        for (int i = 0; i < longitud; i++) {
            int pos = alAzarEntre(0, caracteres.length());
            sal += caracteres.charAt(pos);
        }
        return sal;
    }

    public static void main(String[] args) {
        Seguridad s = new Seguridad();
        System.out.println(s.crearSal(120));
        System.out.println(s.crearSal(20));
        System.out.println(s.crearSal(20));
    }

}
