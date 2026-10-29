package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int interv_00_25 = 0, interv_26_50 = 0, interv_51_75 = 0, interv_76_100 = 0;

        while (numero >= 0) {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 25) {
                interv_00_25++;
            }

        }

            System.out.print("[00,25]: " + interv_00_25);
            System.out.print("[26,50]: " + interv_26_50);
            System.out.print("[51,75]: " + interv_51_75);
            System.out.print("[76,100]: " + interv_76_100);
    }
}
