package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0, mediaAritmetica;
        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Array:[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        mediaAritmetica = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            mediaAritmetica = soma / vetor.length;
        }
        System.out.println("A média das notas é de: " + mediaAritmetica);
    }

}
