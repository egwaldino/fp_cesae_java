package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior;
        int[] vetor = new int[10];

        maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Array:[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.print("O maior é: " + maior);

//        if (vetor[0] > vetor[1]) {
//            System.out.print("Vetor[0] é maior " + vetor[0]);
//        } else if (vetor[1] > vetor[2]) {
//            System.out.print("Vetor[1] é maior " + vetor[1]);
//        } else if (vetor[2] > vetor[3]) {
//            System.out.print("Vetor[2] é maior " + vetor[2]);
//        } else if (vetor[3] > vetor[4]) {
//            System.out.print("Vetor[3] é maior " + vetor[3]);
//        } else if (vetor[4] > vetor[5]) {
//            System.out.print("Vetor[4] é maior " + vetor[4]);
//        } else if (vetor[5] > vetor[6]) {
//            System.out.print("Vetor[4] é maior " + vetor[5]);
//        } else if (vetor[6] > vetor[7]) {
//            System.out.print("Vetor[5] é maior " + vetor[6]);
//        } else if (vetor[7] > vetor[8]) {
//            System.out.print("Vetor[8] é maior " + vetor[7]);
//        }else if (vetor[8] > vetor[9]) {
//            System.out.print("Vetor[9] é maior " + vetor[8]);
//        } else {
//            System.out.print("Vetor[10] é maior " + vetor[9]);
//        }

    }
}
