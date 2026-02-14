package RuteoGUI;

import java.util.Scanner;

public class Configurador
{
    public static void preguntar()
    {
        Scanner s = new Scanner(System.in);

        int a = preguntarInt(s, "Ingresa el primer dígito de tu RUT: ");
        int b = preguntarInt(s, "Ingresa el segundo dígito de tu RUT: ");
        int c = preguntarInt(s, "Ingresa el tercer dígito de tu RUT: ");
        int d = preguntarInt(s, "Ingresa el cuarto dígito de tu RUT: ");

        int t = a + 10*b + 100*c + 1000*d;
        MiFactory.configurar(t);
    }

    private static int preguntarInt(Scanner s, String string)
    {
        System.out.print(string);
        return Integer.parseInt(s.nextLine());
    }
}