package RuteoGUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String []args)
    {
        Configurador.preguntar();

        JFrame frame = new JFrame("Prueba 2");

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(300, 300);

        frame.getContentPane().add(createGUI());

        frame.setVisible(true);
    }

    private static JPanel createGUI()
    {
        JPanel panel = MiFactory.getInstance().crearPanel();

        List<String> nombres = new ArrayList<>();

        nombres.add("B1");
        nombres.add("B2");
        nombres.add("B3");
        nombres.add("B4");
        nombres.add("B5");

        JButton b = null;
        for(String n : nombres) {
            b = new JButton(n);
            MiFactory.getInstance().agregarBoton(panel, b);
        }

        b.addActionListener(e -> {
            System.out.println("Hola, soy el botón");
        });

        return panel;
    }
}