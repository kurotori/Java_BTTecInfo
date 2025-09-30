package com.example.herramientas;

import java.util.Random;

public class Seguridad {

    private String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public int numeroAlAzarEntre(int a, int b) {
        Random r = new Random();
        int numero = r.nextInt(b - a) + a;
        return numero;
    }

    public String crearSal(int longitud) {
        String resultado = "";
        for (int i = 0; i < longitud; i++) {
            int posicion = numeroAlAzarEntre(0, caracteres.length());
            resultado += caracteres.charAt(posicion);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Seguridad s = new Seguridad();
        System.out.println(s.crearSal(20));
    }

}
