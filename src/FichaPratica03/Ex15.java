package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero, fatorial;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        fatorial = numero - 1;

        while(fatorial >= 1) {
            numero *= fatorial;
            fatorial -= 1;
        }
        System.out.println(numero);
    }
}
