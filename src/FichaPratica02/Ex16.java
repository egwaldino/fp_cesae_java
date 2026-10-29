package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, notas, restoValor;

        System.out.print("Introduza um numero: ");
        valor= input.nextInt();
        System.out.println("Valor lido: " + valor + "€");

        notas=valor/200;
        System.out.println("Notas de 200€: "+ notas);

        valor=valor%200;
        notas = valor/100;
        System.out.println("Notas de 100€: " + notas);

        valor=(valor%100);
        notas = valor/50;
        System.out.println("Notas de 50€: " + notas);

        valor=(valor%50);
        notas = valor/20;
        System.out.println("Notas de 20€: " + notas);

        valor=(valor%20);
        notas = valor/10;
        System.out.println("Notas de 10€: " + notas);

        valor=(valor%10);
        notas = valor/5;
        System.out.println("Notas de 50€: " + notas);
    }
}
