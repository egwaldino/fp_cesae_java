package FichaPratica06;

import java.util.Scanner;

public class Ex02 {


    public static int positivo(int num){
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
        } while (numero <= 0);

        return numero;
    }

    public static void imprimirAsteriscos(int quantidade){
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numero = 0;

        imprimirAsteriscos(positivo(numero));

    }

}
