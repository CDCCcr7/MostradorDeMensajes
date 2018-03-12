package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JLabel etiqueta1 = new JLabel("Ingrese su mensaje: ");
    private JTextField campo1 = new JTextField();
    private JButton boton1 = new JButton("Mostrar");


    public Ventana(){
        this.setVisible(true);
        setTitle("Recepcion");
        this.setBounds(20,20,400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        etiqueta1.setBounds(20,20,150,25);
        campo1.setBounds(200,20,100,25);
        boton1.setBounds(100,60,100,30);

        boton1.addActionListener(new Accion1());

        add(etiqueta1);
        add(campo1);
        add(boton1);

    }

    class Accion1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(boton1)) {
                VentanaMostrador nuevaVentana = new VentanaMostrador();
            }
        }

    }
}
