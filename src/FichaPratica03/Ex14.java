package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade, contador = 1, numerosInseridos, var, numerosAnteriores;


        System.out.print("Quantos números deseja inserir: ");
        quantidade = input.nextInt();


        System.out.print("Introduza um número: ");
        numerosAnteriores = input.nextInt();

        while (contador < quantidade) {
            System.out.print("Introduza um número: ");
            numerosInseridos = input.nextInt();
            contador++;
        }

    }
}
