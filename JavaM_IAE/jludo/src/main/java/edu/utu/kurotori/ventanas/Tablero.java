package edu.utu.kurotori.ventanas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tablero extends JFrame{

    public Tablero(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,700);
        getContentPane().setSize(this.getSize());
        getContentPane().setBackground(Color.GREEN);
        inicializar();
        setVisible(true);
    }

    private void inicializar(){
        JPanel cuadro1 = new JPanel();
        cuadro1.setSize(300, 300);
        cuadro1.setBackground(Color.BLUE);
        cuadro1.setBounds(5, 5, 300, 300);
        getContentPane().add(cuadro1);
        //pack();
    }

    public static void main(String[] args) {
        new Tablero();
    }
}

