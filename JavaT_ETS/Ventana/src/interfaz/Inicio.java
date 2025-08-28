package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Inicio extends JFrame{
    Toolkit herramientas;
    JButton boton1;

    private void centrar(){
        herramientas = Toolkit.getDefaultToolkit();
        Dimension d = herramientas.getScreenSize();

        double xVentana = (d.getWidth() / 2) - (getWidth() /2);
        double yVentana = (d.getHeight() / 2) - (getHeight() /2);
        setLocation( (int) xVentana , (int) yVentana);
    }


    public Inicio(){
        configurar();
    }

    private void configurar(){
        setLayout(null);
        setSize(640, 480);
        setTitle("Ventanita");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        centrar();

        boton1 = new JButton("Hacé algo");
        boton1.setBounds(10,10,100,30);
        getContentPane().add(boton1);

        repaint();
    }

    
}
