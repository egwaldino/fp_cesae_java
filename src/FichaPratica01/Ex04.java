package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, area;
        double pi = 3.14;

        System.out.print("Qual é o Raio: ");
        raio = input.nextDouble();

        area = pi * (raio * raio);

        System.out.print("A área da circunferência é: " + area);






    }
}
