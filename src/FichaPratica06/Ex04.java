package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, opcao;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        do {
            System.out.println("+-+-+-+-+-+-+- Análise de um número -+-+-+-+-+-+-+");
            System.out.println(
                    "1. Par ou Ímpar\n" +
                    "2. Positivo ou Negativo\n" +
                    "3. Primo ou Não Primo\n" +
                    "4. Perfeito ou Não Perfeito\n" +
                    "5. Triangular ou Não Triangular\n" +
                    "6. Trocar de Número\n"
            );


            System.out.print("Escolhe uma opção: ");
            opcao = input.nextInt();


            switch (opcao) {
                case 1: //Par ou Impar
                    if (par(numero)) {
                        System.out.println("Par\n");
                    } else {

                        System.out.println("Impar\n");
                    }
                    break;

                case 2: //Positivo ou Negativo
                    if (positivo(numero)) {
                        System.out.println("Positivo\n");
                    } else {

                        System.out.println("Negativo\n");
                    }
                    break;

                case 3: //Primo ou Não Primo
                    if (primo(numero)) {
                        System.out.println("Primo\n");
                    } else {
                        System.out.println("Não primo\n");
                    }
                    break;

                case 4: //Perfeiro ou Não perfeito
                    if (perfeito(numero)) {
                        System.out.println("Perfeito\n");
                    } else {
                        System.out.println("Não Perfeito\n");

                    }
                    break;

                case 5: //Triangular ou Não triangular
                    if (triangular(numero)) {
                        System.out.println("Triangular\n");
                    } else {
                        System.out.println("Não triangular\n");

                    }
                    break;

                case 6:
                    System.out.print("Introduza um novo número: ");
                    numero = input.nextInt();
                    break;

                default:
                    System.out.print("Opção Inválida");
            }
        } while (opcao != 6);
    }
}
