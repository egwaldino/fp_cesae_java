package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto, iniciador = 0;

        System.out.print("Introduza um limite: ");
        limite = input.nextInt();

        System.out.print("Introduza um número: ");
        salto = input.nextInt();

        while (iniciador <= limite) {
            System.out.println(iniciador);
            iniciador = iniciador + salto;
        }
    }
}
