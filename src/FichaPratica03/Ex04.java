package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, limite = -1;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        while (numero <= limite) {
            limite = limite + 1;
            System.out.println(limite);
        }
    }
}
