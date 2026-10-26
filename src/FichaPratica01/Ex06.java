package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Digite o valor 1: ");
        valor1 = input.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = input.nextInt();

        System.out.println("Os valores digitados são - Valor 1 é: " + valor1 + " e o valor 2 é: " + valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        System.out.println("Os valores invertidos são - Valor 1 é: " + valor1 + " e o valor 2 é: " + valor2);

    }
}
