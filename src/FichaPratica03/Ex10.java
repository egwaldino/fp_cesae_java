package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int iniciador = 0, numero;

            System.out.print("Introduza um número: ");
            numero = input.nextInt();

            while (iniciador <= numero){
                System.out.println(iniciador);
                iniciador = iniciador + 2;
            }

        }
}
