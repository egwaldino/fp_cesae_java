package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade, contador = 1, numAtual, anterior;
        boolean crescente = true;

        System.out.print("Quantos números deseja inserir: ");
        quantidade = input.nextInt();

        System.out.print("Introduza um número: ");
        anterior = input.nextInt();

        while (contador < quantidade) {
            System.out.print("Introduza um número: ");
            numAtual = input.nextInt();

            if (anterior >= numAtual) {
                crescente = false;
            }

            anterior = numAtual;
            contador++;

        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }
//        System.out.println("Numero quantidade: " + quantidade);
//        System.out.println("Numero anterior: " + anterior);
//        System.out.println("Numero contador: " + contador);

    }
}
