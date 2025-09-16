package com.example.interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.example.sistema.Usuario;

public class PanelUsuario extends JPanel {

    private Usuario usuario;

    JLabel lblId, lblNombre, lblApellido, lblEmail, lblFechaRegistro;

    public PanelUsuario(Usuario usuario) {
        this.usuario = usuario;
        configurar();
    }

    private void configurar() {
        setSize(400, 150);
        setPreferredSize(getSize());
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        int x = 10;
        int y = 10;

        Font fntTexto = new Font("Calibri", Font.BOLD, 20);

        lblId = new JLabel("ID: " + usuario.getId());
        lblId.setFont(fntTexto);
        lblId.setBounds(x, y, 60, 30);
        add(lblId);

        lblNombre = new JLabel(usuario.getNombre() + " " + usuario.getApellido());
        lblNombre.setFont(fntTexto);
        lblNombre.setBounds((x + 65), y, 240, 30);
        add(lblNombre);

        lblEmail = new JLabel(usuario.getEmail());
        lblEmail.setFont(fntTexto);
        lblEmail.setBounds(x, (y + 75), 240, 30);
        add(lblEmail);

        lblFechaRegistro = new JLabel(usuario.getFecha_registro());
        lblFechaRegistro.setFont(fntTexto);
        lblFechaRegistro.setBounds(x, (y + 120), 150, 30);
        add(lblFechaRegistro);

    }
}
