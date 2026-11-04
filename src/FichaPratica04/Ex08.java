package FichaPratica04;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, i, soma = 0;
        boolean triangular = false;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        for (i = 1; soma < numero; i++) {
            soma += i;

            if (soma == numero) {
                triangular = true;
            }
        }
        if (triangular) {
            System.out.println("Triangular");
        } else {
            System.out.println("Não triangular");

        }

    }
}
