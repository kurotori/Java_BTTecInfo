package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Inicio extends JFrame {
    
    JButton boton1;

    public Inicio(){
        configurar();
    }

    private void configurar(){
        setSize(640, 480);
        setLayout(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ventanita");
        setVisible(true);
        setLocation(50, 50);

        boton1 = new JButton("Click Acá");
        boton1.setBounds(10, 10, 120, 30);
        getContentPane().add(boton1);

        repaint();
    }
}
