package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {

    JTextField txtfDato;
    JButton btnEnviar;
    JButton btnResetear;

    public Inicio() {
        configurar();
    }

    private void configurar() {
        setSize(640, 480);
        setPreferredSize(getSize());
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        txtfDato = new JTextField();
        txtfDato.setBounds(10, 10, 200, 30);
        getContentPane().add(txtfDato);

        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(220, 10, 80, 30);
        getContentPane().add(btnEnviar);
        btnEnviar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnEnviarClick(e);
                    }

                });

        btnResetear = new JButton("X");
        btnResetear.setBounds(310, 10, 50, 30);
        getContentPane().add(btnResetear);
        btnResetear.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtfDato.setText("");
                    }

                });

        pack();
        repaint();

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
