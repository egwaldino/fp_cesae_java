package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.print("Digita o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digita o primeiro número: ");
        num2 = input.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);

    }
}
