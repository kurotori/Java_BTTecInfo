package com.example.herramientas;

import java.security.MessageDigest;
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

    public String hashearDato(String dato) {
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] datos = dato.getBytes();
            byte[] hashDatos = md.digest(datos);
            StringBuilder constructor = new StringBuilder();

            for (byte b : hashDatos) {
                constructor.append(
                        String.format("%02x", b));
            }

            hash = constructor.toString();

        } catch (Exception error) {
            error.printStackTrace();
        }

        return hash;
    }

    public static void main(String[] args) {
        Seguridad s = new Seguridad();

        String sal = s.crearSal(20);
        System.out.println(sal);

        String hash = s.hashearDato(sal);
        System.out.println(hash);

    }

}
