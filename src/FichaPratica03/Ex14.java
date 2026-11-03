package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, numero = 1, numerosInseridos, var, numerosAnteriores;


        System.out.print("Quantos números deseja inserir: ");
        limite = input.nextInt();

        var = limite;

        System.out.print("Introduza um número: ");
        numerosAnteriores = input.nextInt();

        while (limite > numero) {
            System.out.print("Introduza um número: ");
            numerosInseridos = input.nextInt();
            numero++;

            if(numerosAnteriores < numerosInseridos) {

            }
        }
    }
}
