package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, resultado;
        String operacao, decisao;

        do {

            System.out.print("Introduza o primeiro numero: ");
            num1 = input.nextInt();

            System.out.print("Introduza o operador (+, -, *, /): ");
            operacao = input.next();

            System.out.print("Introduza o segundo numero: ");
            num2 = input.nextInt();

            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("A soma dos numeros: " + num1 + " + " + num2 + " é: " + resultado);
                    break;

                case "-":
                    resultado = num1 - num2;
                    System.out.println("A subtração dos numeros: " + num1 + " - " + num2 + " é: " + resultado);
                    break;

                case "*":
                    resultado = num1 * num2;
                    System.out.println("A multiplicação dos numeros: " + num1 + " * " + num2 + " é: " + resultado);
                    break;

                case "/":
                    resultado = num1 / num2;
                    System.out.println("A divisão dos numeros: " + num1 + " / " + num2 + " é: " + resultado);
                    break;

                default:
                    System.out.println("Operação Inválida: " + operacao);
            }
            System.out.println("Deseja continuar? (Introduza s/n): ");
            decisao = input.next();

        } while (!decisao.equals("n"));


    }
}
