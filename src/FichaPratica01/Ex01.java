package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar Variaveis

        int num1, num2, soma;

        // Ler Variaveis do utilizador
        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        System.out.print("Insira outro numero: ");
        num2 = input.nextInt();

        // Calcular Variaveis

        soma = num1 + num2;

        // Apresentar Resultado
        System.out.printf("O resultado da soma é: " + soma);


    }
}