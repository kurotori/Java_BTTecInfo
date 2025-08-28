package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Inicio extends JFrame{

    JButton boton;

    public Inicio() {
        configurar();
    }

    private void configurar(){
        setSize(640,480);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        boton = new JButton("A");
        boton.setBounds(0,0,50,50);
        getContentPane().add(boton);

        addMouseMotionListener(
            new MouseMotionListener() {

                @Override
                public void mouseDragged(MouseEvent e) {
                    boton.setLocation(e.getX(), e.getY());
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                   System.out.println(
                    "X:"+ e.getX() + " Y:" + e.getY());
                    
                }
                
            }
        );
    }

    public static void main(String[] args) {
        Inicio v1 = new Inicio();
    }

}
