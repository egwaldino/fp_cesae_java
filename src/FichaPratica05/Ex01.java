package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int i;

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número no Array[" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


    }
}
