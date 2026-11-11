package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] comissoes = new int[12];
        int i, soma = 0;

        for (i = 0; i < comissoes.length; i++) {
            System.out.print("Adicione uma comissão: ");
            comissoes[i] = input.nextInt();
        }

        for (i = 0; i < comissoes.length; i++) {
            soma += comissoes[i];
        }
        System.out.println("A soma total anual: " + soma);
   }
}
