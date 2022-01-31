package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Qué tabla de multiplicar quieres ver? La del: ");
        n = entrada.nextInt();

        while (i <= 10) {
            System.out.println(i + " x " + n + " = " + i * n);
            i++;
        }
    }
}
