package com.example.herramientas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class CampoTexto extends JTextField {
    private String textoAyuda;

    Color colorTextoAyuda = Color.gray;

    public CampoTexto(String textoAyuda) {
        super(textoAyuda);
        this.setForeground(colorTextoAyuda);

        this.addFocusListener(
                new FocusListener() {

                    @Override
                    public void focusGained(FocusEvent e) {
                        if (getText().equals(textoAyuda)) {
                            setForeground(colorTextoAyuda);
                            setText("");
                        }
                        setForeground(Color.BLACK);
                    }

                    @Override
                    public void focusLost(FocusEvent e) {
                        if (getText().length() < 1) {
                            setForeground(colorTextoAyuda);
                            setText(textoAyuda);
                        }
                    }

                });
    }
}
