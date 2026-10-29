package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        String ordem;


        System.out.print("Introduza um numero: ");
        a = input.nextInt();

        System.out.print("Introduza um numero: ");
        b = input.nextInt();

        System.out.print("Introduza um numero: ");
        c = input.nextInt();

        System.out.print("Escolhe como quer ordenar, digite 'C' crescente e 'D' decrescente: ");
        ordem = input.next();

        switch (ordem) {
            case "C":
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
                break;

                case "D": 
                 // Caso 1: A é o maior
        if (a >= b && b >= c) {
            System.out.println("Ordem decrescente: " + a + ", " + b + ", " + c);
        } else if (a >= c && c >= b) {
            System.out.println("Ordem decrescente: " + a + ", " + c + ", " + b);
        }
        // Caso 2: B é o maior
        if (b >= a && a >= c) {
            System.out.println("Ordem decrescente: " + b + ", " + a + ", " + c);
        } else if (b >= c && c >= a) {
            System.out.println("Ordem decrescente: " + b + ", " + c + ", " + a);
        } 
        // Caso 3: C é o maior
        if (c >= a && a >= b) {
            System.out.println("Ordem decrescente: " + c + ", " + a + ", " + b);
        } else if (c >= b && b >= a) {
            System.out.println("Ordem decrescente: " + c + ", " + b + ", " + a);
        }
        break;
        
            default:
                System.out.println("Ordem inválda.");
                break;
        }
    }
}
