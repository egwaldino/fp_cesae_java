package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaAritmetica, mediaPonderada;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é de: " + mediaAritmetica);

        mediaPonderada = (nota1 * 0.20) + (nota2 * 0.30) + (nota3 * 0.50);
        System.out.print("Media Ponderada: " + mediaPonderada);

    }
}
