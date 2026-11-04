package FichaPratica04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numJogador1, numJogador2, contador =0;

        System.out.print("Introduza um valor (0-100): ");
        numJogador1 = input.nextInt();

        // Limpar a consola
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

        do {
            System.out.println("Qual o valor introduzido?");
            numJogador2 = input.nextInt();

            if (numJogador2 < numJogador1) {
                System.out.println("Valor introduzido é inferior...");
            } else {
                System.out.println("Valor introduzido é superior...");
            }

            contador++;

            if (numJogador1 == numJogador2) {
                System.out.println("Parabéns você acertou, numero de tentativas: " + contador);
            }


        } while (numJogador1 != numJogador2);
    }
}
