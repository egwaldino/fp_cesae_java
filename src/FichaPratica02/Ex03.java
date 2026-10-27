package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salarioAnual, taxa;

        System.out.println("Introduza um salario: ");
        salarioAnual = input.nextDouble();

        if (salarioAnual <= 15000) {
            taxa = salarioAnual * 0.2;
            System.out.println("Para o salário anual lido de " + salarioAnual + "€ Paga taxa de 20%: " + taxa + "€");
        }
        else if (salarioAnual <= 20000) {
            taxa = salarioAnual * 0.3;
            System.out.println("Para o salário anual lido de " + salarioAnual + "€ Paga taxa de 30%: " + taxa + "€");
        } else if (salarioAnual <= 25000){
            taxa = salarioAnual * 0.35;
            System.out.println("Para o salário anual lido de " + salarioAnual + "€ Paga taxa de 35%: " + taxa + "€");
        } else {
            taxa = salarioAnual * 0.4;
            System.out.println("Para o salário anual lido de " + salarioAnual + "€ Paga taxa de 40%: " + taxa + "€");
        }
    }
}
