package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {

    JButton btnEnviar;
    JButton btnLimpiar;
    JTextField txtfDato;
    JLabel lblDato;

    Inicio estaVentana = this;

    public Inicio() {
        configurar();
    }

    private void configurar() {
        setSize(640, 480);
        setPreferredSize(getSize());
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Configuración del Label(etiqueta)
        lblDato = new JLabel("Dato a enviar:");
        lblDato.setBounds(10, 10, 120, 30);
        getContentPane().add(lblDato);

        // Configuración del Text Field(campo de entrada de texto)
        txtfDato = new JTextField();
        txtfDato.setBounds(130, 10, 200, 30);
        getContentPane().add(txtfDato);

        btnLimpiar = new JButton("X");
        btnLimpiar.setBounds(350, 10, 50, 30);
        getContentPane().add(btnLimpiar);
        btnLimpiar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtfDato.setText("");
                    }

                });

        // Configuración del Button(botón)
        btnEnviar = new JButton("Enviar Dato");
        btnEnviar.setBounds(130, 45, 200, 30);
        getContentPane().add(btnEnviar);
        btnEnviar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Segunda v2 = new Segunda(estaVentana);
                        // setVisible(false);
                        btnEnviarClick(e);
                    }

                });

        // Actualización de los elementos en la ventana
        repaint();
        pack();
    }

    public static void main(String[] args) {
        Inicio v1 = new Inicio();
    }

    private void btnEnviarClick(ActionEvent e) {
        String texto = txtfDato.getText();
        Segunda v2 = new Segunda(this, texto);
        setVisible(false);
    }

}
