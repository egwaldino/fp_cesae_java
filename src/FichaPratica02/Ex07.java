package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero, par, impar;

        System.out.print("Introduza um número: ");
        numero = input.nextDouble();

        if(numero % 2 == 0){
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é ímpar.");
        }
    }
}
