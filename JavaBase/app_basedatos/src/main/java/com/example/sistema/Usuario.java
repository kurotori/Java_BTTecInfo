package com.example.sistema;

public class Usuario {
    int id;
    String nombre;
    String apellido;
    String email;
    String fecha_registro;

    public Usuario(
            int id,
            String nombre, String apellido,
            String email, String fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }
}
