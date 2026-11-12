package FichaPratica06;

import java.util.Scanner;


import static FichaPratica06.Ex05.*;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao, tamanhoVetor;

        System.out.print("Introduza o tamanho: ");
        tamanhoVetor = input.nextInt();

        int[] vetor = preencherVetor(tamanhoVetor);


        do {
            System.out.println("+-+-+-+-+-+-+- Análise de um Vetor -+-+-+-+-+-+-+");
            System.out.println(
                    "1. Maior Elemento\n" +
                    "2. Menor Elemento\n" +
                    "3. Crescente ou Não Crescente \n" +
                    "0. Encerrar... \n"
            );


            System.out.print("Escolhe uma opção: ");
            opcao = input.nextInt();


            switch (opcao) {
                case 1: //Maior Elemento
                    System.out.println("Maior: " + maior(vetor));
                    break;

                case 2: //Menor Elemento
                    System.out.println("Menor: " + menor(vetor));
                    break;

                case 3: //Crescente ou Não Crescente
                    if (crescente(vetor)) {
                        System.out.println("Crescente\n");
                    } else {
                        System.out.println("Não Crescente\n");
                    }
                    break;

                    case 0: //Crescente ou Não Crescente
                        System.out.println("Encerrando...");
                    break;

                default:
                    System.out.print("Opção Inválida");
            }
        } while (opcao != 0);
    }
}
