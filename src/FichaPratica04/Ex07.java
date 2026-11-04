package FichaPratica04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        boolean primo = true;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                primo = false;
            }
        }

        if(primo){
            System.out.println("Primo");
        }else{
            System.out.println("Não primo");
        }

    }
}
