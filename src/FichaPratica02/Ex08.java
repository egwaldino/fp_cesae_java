package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPonderada;

        System.out.print("Introduza a 1ª nota: ");
        nota1 = input.nextDouble();

        System.out.print("Introduza a 2ª nota: ");
        nota2 = input.nextDouble();

        System.out.print("Introduza a 3ª nota: ");
        nota3 = input.nextDouble();

        mediaPonderada = (nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4);

        if (mediaPonderada > 9.5 && mediaPonderada <= 20) {
            System.out.println("Com a media de: " + mediaPonderada + "\nEstá aprovado");
        } else if (mediaPonderada <= 9.5 && mediaPonderada >= 0) {
            System.out.println("Com a media de: " + mediaPonderada + "\nEstá reprovado");
        } else {
            System.out.println("Introduza um número de (0-20 valores).");
        }
    }
}
