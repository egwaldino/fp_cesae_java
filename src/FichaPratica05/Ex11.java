package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Insira um número na Matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");

            }
            System.out.println();
        }

        int maior = matriz[0][0], menor = matriz[0][0];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }

            }

        }
        System.out.println("O maior numero é o: " + maior);
        System.out.println("O menor numero é o: " + maior);
    }

}
