package FichaPratica06;

import java.util.Scanner;

public class Ex05 {
    public static int maior(int[] vetor) {
        int maior;
        maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int menor(int[] vetor) {
        int menor;
        menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static boolean crescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                return false;
//                break;
            }
        }
        return true;
    }

    public static int[] preencherVetor(int tamanho) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza um número:[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        return vetor;

    }
}
