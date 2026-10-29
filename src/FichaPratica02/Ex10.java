package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;
        String operacao;

        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();

        System.out.print("Introduza outro número: ");
        num2 = input.nextDouble();

        System.out.print("Introduza a operação ( + - * / ): ");
        operacao = input.next();

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("A soma dos numeros: " + num1 + " + " + num2 + " é: " + resultado);
                break;

                case "-":
                resultado = num1 - num2;
                System.out.println("A subtração dos numeros: " + num1 + " + " + num2 + " é: " + resultado);
                break;

                case "*":
                resultado = num1 * num2;
                System.out.println("A multiplicação dos numeros: " + num1 + " + " + num2 + " é: " + resultado);
                break;

                case "/":
                resultado = num1 / num2;
                System.out.println("A divisão dos numeros: " + num1 + " + " + num2 + " é: " + resultado);
                break;

            default:
                System.out.println("Operação Inválida: " + operacao);
        }
    }
}
