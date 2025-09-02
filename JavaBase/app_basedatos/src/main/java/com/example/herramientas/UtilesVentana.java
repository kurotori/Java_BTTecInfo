package com.example.herramientas;

import java.awt.Component;

import javax.swing.JFrame;

public class UtilesVentana {

    /**
     * Permite centrar, horizontalmente, un elemento dentro de su ventana
     * 
     * @param elemento El elemento que se quiere centrar
     * @param ventana  La ventana en la que pertenece el elemento
     */
    public static void centrarEnVentana(Component elemento, JFrame ventana) {
        elemento.setBounds(
                ((ventana.getWidth() / 2) - (elemento.getWidth() / 2)),
                elemento.getY(),
                elemento.getWidth(),
                elemento.getHeight());
    }
}
