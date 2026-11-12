package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        System.out.println("_______________Leitura do vetor01______________");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira um número no Array1[" + i + "][" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        System.out.println("_______________Leitura do vetor02______________");

        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira um número no Array2[" + i + "][" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        int[][] matriz = new int[10][2];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = vetor1[i];
            matriz[i][1] = vetor2[i];
        }

        System.out.println("_______________Impressão da Matriz______________");

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}