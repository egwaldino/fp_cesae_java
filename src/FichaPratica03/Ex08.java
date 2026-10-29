package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, anteriores;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        anteriores = numero - 5;

        while (anteriores <= numero + 5){
            if(anteriores != numero) {
                System.out.println(anteriores);
            }
            anteriores++;
        }


    }
}
