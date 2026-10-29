package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, crescente = 0, numero, contador = 1;

        System.out.print("Quantos números deseja inserir: ");
        limite = input.nextInt();

        while (contador <= limite) {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
            contador++;

        }

    }
}
