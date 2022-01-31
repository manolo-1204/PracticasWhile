package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String t;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe lo que quiera, 'salir' para cerrar el bucle:");
        t = entrada.nextLine();

        while (!t.equals("salir")) {
            System.out.println(t);
            System.out.println("Escribe lo que quiera, 'salir' para cerrar el bucle:");
            t = entrada.nextLine();
        }
        entrada.close();
    }
}
