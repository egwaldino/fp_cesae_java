package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[4];
        int maior;


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Array:[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                if (vetor[i] % 2 == 0) {
                    maior = vetor[i];
                }
            }
        }

        if (maior % 2 == 0) {
            System.out.print("O maior e o par é: " + maior);
        } else {
            System.out.println("Não existe valores pares." + maior);
        }
    }
}
