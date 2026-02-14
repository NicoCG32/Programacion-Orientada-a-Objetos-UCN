package RuteoGUI;

import javax.swing.*;
import java.awt.*;

public class MiFactory2 extends MiFactory
{
    public JPanel crearPanel()
    {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        return p;
    }

    public void agregarBoton(JPanel panel, JButton botón)
    {
        panel.add(botón);
    }
}