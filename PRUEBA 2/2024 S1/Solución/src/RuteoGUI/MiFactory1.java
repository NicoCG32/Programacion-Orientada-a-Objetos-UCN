package RuteoGUI;

import javax.swing.*;
import java.awt.*;

public class MiFactory1 extends MiFactory
{
    private int contador = 0;

    public JPanel crearPanel()
    {
        return new JPanel(new BorderLayout());
    }

    public void agregarBoton(JPanel panel, JButton button)
    {
        switch(contador) {
            case 0: panel.add(button, BorderLayout.NORTH); break;
            case 1: panel.add(button, BorderLayout.SOUTH); break;
            case 2: panel.add(button, BorderLayout.EAST); break;
            case 3: panel.add(button, BorderLayout.WEST); break;
            case 4: panel.add(button, BorderLayout.CENTER); break;
        }

        contador++;
        if (contador > 4) contador = 0;
    }
}