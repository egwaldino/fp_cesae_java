package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menor;
        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Array:[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.print("O menor é: " + menor);
    }
}
