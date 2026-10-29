package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0, media, soma = 1, numerosAdicionados = -1;

        while (numero != -1) {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
            soma = soma + numero;
            numerosAdicionados = numerosAdicionados + 1;
        }
        media = soma / numerosAdicionados;
        System.out.print("Média: " + media);
    }
}
