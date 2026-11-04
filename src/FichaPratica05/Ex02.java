package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] comissoes = new int[12];
        int i;

        for (i = 1; i < comissoes.length; i++) {
            System.out.println("Adicione uma comissão: ");
            comissoes[0] = input.nextInt();
            System.out.println(comissoes[i]);
        }
    }
}
