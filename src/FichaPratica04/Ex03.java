package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, contador = 1;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        while (contador <= numero) {
            if (numero % contador == 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
