package com.example.interfaz;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.example.bdd.Conexion;
import com.example.herramientas.CampoTexto;
import com.example.herramientas.UtilesVentana;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {

    JLabel lblServidor, lblPuerto, lblBase, lblUsuario, lblContrasenia, lblTitulo;
    JTextField txtServidor, txtPuerto, txtBase, txtUsuario;
    JPasswordField passContrasenia;
    JButton btnIngresar;

    public Inicio() {
        configurar();
    }

    private void configurar() {
        setSize(350, 360);
        setPreferredSize(getSize());
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        // Posiciones iniciales
        int x = 10;
        int y = 10;

        // Fuentes para la ventana
        Font fntTitulo = new Font("Calibri", Font.BOLD, 24);
        Font fntEtiqueta = new Font("Calibri", Font.PLAIN, 18);

        lblTitulo = new JLabel("Ingresar al Sistema");
        lblTitulo.setBounds(220, y, 200, 30);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setVerticalAlignment(JLabel.CENTER);
        lblTitulo.setFont(fntTitulo);
        UtilesVentana.centrarEnVentana(lblTitulo, this);
        getContentPane().add(lblTitulo);

        lblServidor = new JLabel("Servidor:");
        lblServidor.setBounds(x, (y + 40), 120, 30);
        lblServidor.setFont(fntEtiqueta);
        agregarControl(lblServidor);

        lblPuerto = new JLabel("Puerto:");
        lblPuerto.setBounds(x, (y + 80), 120, 30);
        lblPuerto.setFont(fntEtiqueta);
        agregarControl(lblPuerto);

        lblBase = new JLabel("Base de Datos:");
        lblBase.setBounds(x, (y + 120), 120, 30);
        lblBase.setFont(fntEtiqueta);
        agregarControl(lblBase);

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(x, (y + 160), 120, 30);
        lblUsuario.setFont(fntEtiqueta);
        agregarControl(lblUsuario);

        lblContrasenia = new JLabel("Contraseña:");
        lblContrasenia.setBounds(x, (y + 200), 120, 30);
        lblContrasenia.setFont(fntEtiqueta);
        agregarControl(lblContrasenia);

        x += 140;

        txtServidor = new CampoTexto("IP del Servidor...");
        txtServidor.setBounds(x, (y + 40), 140, 30);
        agregarControl(txtServidor);

        txtPuerto = new CampoTexto("Puerto del Servidor...");
        txtPuerto.setBounds(x, (y + 80), 140, 30);
        agregarControl(txtPuerto);

        txtBase = new CampoTexto("Base de datos...");
        txtBase.setBounds(x, (y + 120), 140, 30);
        agregarControl(txtBase);

        txtUsuario = new CampoTexto("Usuario...");
        txtUsuario.setBounds(x, (y + 160), 140, 30);
        agregarControl(txtUsuario);

        passContrasenia = new JPasswordField();
        passContrasenia.setBounds(x, (y + 200), 140, 30);
        agregarControl(passContrasenia);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(x, (y + 260), 120, 30);
        UtilesVentana.centrarEnVentana(btnIngresar, this);
        agregarControl(btnIngresar);

        btnIngresar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnIngresar_click(e);
                    }
                });

        repaint();
        pack();
    }

    private void agregarControl(Component control) {
        getContentPane().add(control);
    }

    /**
     * 
     * @param e
     */
    private void btnIngresar_click(ActionEvent e) {
        String servidor = txtServidor.getText();
        int puerto = Integer.parseInt(txtPuerto.getText());
        String base = txtBase.getText();
        String usuario = txtUsuario.getText();
        String contrasenia = new String(passContrasenia.getPassword());

        Conexion conexion = new Conexion(servidor, puerto, base, usuario, contrasenia);
        passContrasenia.setText("");
        if (conexion.probarConexion()) {
            Principal p = new Principal(conexion, this);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        Inicio i = new Inicio();
    }
}
