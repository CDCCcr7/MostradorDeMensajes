package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaMostrador extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel etiqueta1 = new JLabel();
    private VentanaMostrador ventana = this;

    public VentanaMostrador(){
        setTitle("Mostrador");
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamPantalla = miPantalla.getScreenSize();
        int altPantalla = tamPantalla.height;
        int ancPantalla = tamPantalla.width;

        this.setSize(ancPantalla/2, altPantalla/2);
        this.setLocation(ancPantalla/4, altPantalla/4);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        panel.setBounds(0,0,ancPantalla,altPantalla);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        panel.addMouseListener(new ActionMouse());

        etiqueta1.setBounds(65,50,400,300);
        etiqueta1.setForeground(Color.WHITE);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 100));

        panel.add(etiqueta1);
        this.add(panel);
    }


    private class ActionMouse implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            ventana.dispose();
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
