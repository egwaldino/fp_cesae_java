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

        if (nota1 >= 0 && nota1 <= 20 && nota2 >= 0 && nota2 <= 20 && nota3 >= 0 && nota3 <= 20) {
            if (mediaPonderada >= 9.5) {
                System.out.println("Com a media de: " + mediaPonderada + "\nEstá aprovado");
            } else{
                System.out.println("Com a media de: " + mediaPonderada + "\nEstá reprovado");
            }
        } else {
            System.out.println("Números inseridos inválidos. Introduza um número de (0-20 valores).");
        }
    }
}
