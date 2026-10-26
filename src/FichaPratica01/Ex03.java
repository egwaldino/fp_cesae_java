package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        double largura, altura, area, perimetro;

        System.out.print("Qual é a Largura do retângulo: ");
        largura = input.nextDouble();

        System.out.print("Qual é o comprimento do retângulo: ");
        altura = input.nextDouble();

        area = largura * altura;
        perimetro = 2 * (largura + altura);

        System.out.println("A área de um retângulo é: " + area + " cm");
        System.out.println("O perímetro de um retângulo é: " + perimetro + " cm");



    }
}
