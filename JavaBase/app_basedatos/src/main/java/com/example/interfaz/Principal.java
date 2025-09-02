package com.example.interfaz;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.example.bdd.Conexion;
import com.example.herramientas.UtilesVentana;
import com.example.sistema.Usuario;

public class Principal extends JFrame {

    private Conexion conexion;
    private Inicio anterior;

    private JLabel lblTitulo, lblResultados, lblBusqueda;
    private JButton btnBuscar, btnResetear, btnNuevo, btnModificar, btnBorrar;
    private JPanel pnlResultados;

    public Principal(Conexion conexion, Inicio anterior) {
        this.conexion = conexion;
        this.anterior = anterior;
        configurar();
    }

    private void configurar() {
        setSize(640, 480);
        setPreferredSize(getSize());
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        pnlResultados = new JPanel();
        pnlResultados.setBounds(10, 80, 510, 300);
        pnlResultados.setLayout(
                new BoxLayout(pnlResultados, BoxLayout.Y_AXIS));
        JScrollPane pnlScrolling = new JScrollPane(pnlResultados);
        pnlScrolling.setBounds(10, 100, 510, 300);

        /*
         * for (int i = 0; i < 20; i++) {
         * JButton a = new JButton("I: " + i);
         * pnlResultados.add(a);
         * }
         */

        pnlScrolling.setBorder(BorderFactory.createLineBorder(Color.black));
        getContentPane().add(pnlScrolling);
        UtilesVentana.centrarEnVentana(pnlScrolling, this);

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        cerrarVentana(e);
                    }
                });

        if (conexion != null) {
            try {
                String consulta = "select id, nombre, apellido, email, fecha_registro  from usuarios";
                Connection c = conexion.crearConexion();
                Statement sentencia = c.createStatement();
                ResultSet resultado = sentencia.executeQuery(consulta);

                while (resultado.next()) {
                    Usuario u = new Usuario(
                            resultado.getInt(1),
                            resultado.getString(2),
                            resultado.getString(3),
                            resultado.getString(4),
                            resultado.getString(5));
                    PanelUsuario p = new PanelUsuario(u);
                    pnlResultados.add(p);
                }
                resultado.close();
                sentencia.close();
                c.close();

            } catch (Exception e) {
                System.out.println("\nError: " + e.getMessage());
            }
        }

        repaint();
        pack();
    }

    private void cerrarVentana(WindowEvent e) {
        String mensaje = "Va a salir del sistema.\n¿Desea continuar?";
        int cerrar = JOptionPane.showConfirmDialog(this, mensaje, "Salir del sistema",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (cerrar == 0) {
            anterior.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        Principal p = new Principal(null, null);
    }
}
