package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioLidoAnual, taxa;

        System.out.println("Introduza um salario: ");
        salarioLidoAnual = input.nextDouble();

        if(salarioLidoAnual <= 15000) {
            taxa = salarioLidoAnual * 0.2;
            System.out.println("Para o salário anual lido de " + salarioLidoAnual + "€ Paga taxa de 20%: " + taxa + "€");
        } else {
            taxa = salarioLidoAnual * 0.3;
            System.out.println("Para o salário anual lido de " + salarioLidoAnual + "€ Paga taxa de 30%: " + taxa + "€");
        }
    }
}
