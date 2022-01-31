package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int filas;
        Scanner entrada =new Scanner(System.in);

        System.out.print("Indica la altura, en filas, del triángulo: ");
        filas = entrada.nextInt();

        for (int i = 0; i < filas; i++) {
            System.out.print("1" + i);
        }
    }
}
