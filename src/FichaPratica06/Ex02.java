package FichaPratica06;

import java.util.Scanner;

public class Ex02 {

    static void imprimirAsteriscos(int quantidade){
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
        } while (numero <= 0);


        imprimirAsteriscos(numero);

    }

}
