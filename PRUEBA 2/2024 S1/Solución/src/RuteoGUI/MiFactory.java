package RuteoGUI;

import javax.swing.*;
import java.awt.*;

public abstract class MiFactory
{
    private static MiFactory factory = null;

    protected MiFactory() { }

    public static void configurar(int num)
    {
        if ((num % 2) == 0) {
            factory = new MiFactory1();
        } else {
            factory = new MiFactory2();
        }
    }

    public static MiFactory getInstance() { 
        return factory; 
    }

    public abstract JPanel crearPanel();
    public abstract void agregarBoton(JPanel panel, JButton b);
}