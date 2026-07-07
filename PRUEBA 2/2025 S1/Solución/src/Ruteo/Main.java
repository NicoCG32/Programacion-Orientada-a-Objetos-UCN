import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

interface Strategy {
    int operate(int number);
}

class DefaultStrategy implements Strategy {
    public int operate(int number) {
        return 1;
    }
}

class MultiplyStrategy implements Strategy {
    public int operate(int number) {
        return number * number;
    }
}

class AddStrategy implements Strategy {
    public int operate(int number) {
        return number + number;
    }
}

class ZeroStrategy implements Strategy {
    public int operate(int number) {
        return 0;
    }
}

public class Main {
    private static int currentNumber = -1;
    private static Strategy strategy = new DefaultStrategy();
    private static JButton btnEspecial;
    private static boolean botonVisible = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton btnIngresar = new JButton("Ingresar Número");
        JButton btnMostrar = new JButton("Mostrar Resultado");
        JButton btnBorrar = new JButton("Borrar");
        btnEspecial = new JButton("Usar estrategia cero");
        btnEspecial.setVisible(false);

        buttonPanel.add(btnIngresar);
        buttonPanel.add(btnMostrar);
        buttonPanel.add(btnBorrar);
        buttonPanel.add(btnEspecial);

        frame.add(buttonPanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);
        frame.add(centerPanel, BorderLayout.CENTER);

        centerPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                botonVisible = !botonVisible;
                btnEspecial.setVisible(botonVisible);
                if (botonVisible) {
                    btnEspecial.setText("Botón especial visible");
                } else {
                    btnEspecial.setText("Botón especial oculto");
                }
            }
        });

        btnIngresar.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Ingresa un número:");
            try {
                currentNumber = Integer.parseInt(input);
                if (currentNumber % 2 == 0) {
                    strategy = new MultiplyStrategy();
                } else {
                    strategy = new AddStrategy();
                }
                System.out.println("Número ingresado: " + currentNumber);
            } catch (NumberFormatException ex) {
                System.out.println("Entrada inválida.");
            }
        });

        btnMostrar.addActionListener(e -> {
            int result = strategy.operate(currentNumber);
            if (currentNumber == -1) {
                System.out.println("No hay número ingresado. Resultado: " + result);
            } else {
                System.out.println("Número actual: " + currentNumber + " -> Resultado: " + result);
            }
        });

        btnBorrar.addActionListener(e -> {
            currentNumber = -1;
            strategy = new DefaultStrategy();
            System.out.println("Número borrado. Estrategia reseteada.");
        });

        btnEspecial.addActionListener(e -> {
            strategy = new ZeroStrategy();
            System.out.println("Estrategia cambiada: ahora siempre devuelve 0.");
        });

        frame.setVisible(true);
    }
}