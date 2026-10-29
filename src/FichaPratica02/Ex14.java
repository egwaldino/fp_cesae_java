package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, menor, meio, maior;

        System.out.print("Introduza um numero: ");
        a = input.nextDouble();

        System.out.print("Introduza um numero: ");
        b = input.nextDouble();

        System.out.print("Introduza um numero: ");
        c = input.nextDouble();

        // Caso 1: A é o menor
        if (a <= b && b <= c) {
            System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
        } else if (a <= c && c <= b) {
            System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);
        }
        // Caso 2: B é o menor
        if (b <= a && a <= c) {
            System.out.println("Ordem crescente: " + b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {
            System.out.println("Ordem crescente: " + b + ", " + c + ", " + a);
        } 
        // Caso 3: C é o menor
        if (c <= a && a <= b) {
            System.out.println("Ordem crescente: " + c + ", " + a + ", " + b);
        } else if (c <= b && b <= a) {
            System.out.println("Ordem crescente: " + c + ", " + b + ", " + a);
        }
    }
}
