package com.example;

import java.security.MessageDigest;
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

    public String hashearDato(String dato) {
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] datos = dato.getBytes();
            byte[] datosHash = md.digest(datos);
            StringBuilder constructor = new StringBuilder();
            for (byte b : datosHash) {
                constructor.append(
                        String.format("%02x", b));
            }
            hash = constructor.toString();

        } catch (Exception e) {
            // TODO: handle exception
        }
        return hash;
    }

    public static void main(String[] args) {
        Seguridad s = new Seguridad();
        System.out.println(s.hashearDato("contraseña"));
    }
}
