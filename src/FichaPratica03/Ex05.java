package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, iniciador=1;
        String mensagem;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        input.nextLine();

        System.out.print("Introduza uma mensagem: ");
        mensagem = input.nextLine();

        while (iniciador <= numero) {
            iniciador = iniciador + 1;
            System.out.println(mensagem);
        }
    }
}
