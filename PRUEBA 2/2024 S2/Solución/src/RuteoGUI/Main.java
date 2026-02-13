package RuteoGUI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Configurator configurator = Configurator.getInstance();
        configurator.setStrategyBasedOnRut();
        configurator.applyLayout();
    }
}

class Configurator {
    private static Configurator instance;
    private LayoutStrategy strategy;

    private Configurator() {
    }

    public static Configurator getInstance() {
        if (instance == null) {
            instance = new Configurator();
        }
        return instance;
    }

    public void setStrategyBasedOnRut() {
        int fourthDigit = askForFourthRutDigit();

        if (fourthDigit >= 0 && fourthDigit <= 5) {
            strategy = new HorizontalLayoutStrategy();
        } else if (fourthDigit >= 6 && fourthDigit <= 9) {
            strategy = new VerticalLayoutStrategy();
        } else {
            System.out.println("Dígito inválido. Se usará layout horizontal por defecto.");
            strategy = new HorizontalLayoutStrategy();
        }
    }

    public void applyLayout() {
        if (strategy == null) {
            System.out.println("Estrategia no configurada. Usa setStrategyBasedOnRut() primero.");
            return;
        }

        JFrame frame = new JFrame("Ventana con Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = strategy.createLayout();
        frame.add(panel);

        frame.setVisible(true);
    }

    private int askForFourthRutDigit() {
        System.out.print("Ingresa tu RUT (sin puntos ni guión, ejemplo: 12345678-9): ");
        String rut = new java.util.Scanner(System.in).nextLine();

        if (rut.length() < 4) {
            throw new IllegalArgumentException("El RUT debe tener al menos 4 dígitos.");
        }

        char fourthChar = rut.charAt(rut.length() - 5); // Obtiene el cuarto dígito (de derecha a izquierda antes del dígito verificador)

        if (!Character.isDigit(fourthChar)) {
            throw new IllegalArgumentException("El cuarto carácter debe ser un dígito.");
        }

        return Character.getNumericValue(fourthChar);
    }
}

class HorizontalLayoutStrategy implements LayoutStrategy {
    public JPanel createLayout() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        addButtons(panel);
        return panel;
    }

    private void addButtons(JPanel panel) {
        for (int i = 1; i <= 5; i++) {
            panel.add(new JButton("Botón " + i));
        }
    }
}

interface LayoutStrategy {
    JPanel createLayout();
}

class VerticalLayoutStrategy implements LayoutStrategy {
    public JPanel createLayout() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        addButtons(panel);
        return panel;
    }

    private void addButtons(JPanel panel) {
        for (int i = 1; i <= 5; i++) {
            panel.add(new JButton("Botón " + i));
        }
    }
}