package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        if(num1 > num2) {
            System.out.print("O maior é: " + num1);
        } else {
            System.out.print("O maior é: " + num2);
        }

    }
}
