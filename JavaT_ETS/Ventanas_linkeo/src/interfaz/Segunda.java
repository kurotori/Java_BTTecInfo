package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Segunda extends JFrame {

    JButton btnVolver;
    JLabel lblDato;
    Inicio anterior;
    String dato;

    public Segunda(Inicio anterior, String dato) {
        this.anterior = anterior;
        this.dato = dato;
        configurar();
    }

    private void configurar() {
        setSize(640, 480);
        setLayout(null);
        setVisible(true);

        lblDato = new JLabel("...");
        lblDato.setBounds(10, 10, 200, 30);
        getContentPane().add(lblDato);
        lblDato.setText(dato);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(10, 50, 120, 30);
        getContentPane().add(btnVolver);

        btnVolver.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        anterior.setVisible(true);
                        dispose();
                    }

                });

        repaint();
    }

}
