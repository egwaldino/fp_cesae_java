package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoMedio, saldoAtual, valorMovimentar, creditar, debitar, operacao;

        System.out.print("Introduza o saldo médio: ");
        saldoMedio = input.nextDouble();

        System.out.print("Introduza o valor a movimentar: ");
        valorMovimentar = input.nextDouble();

        saldoAtual =  saldoMedio + valorMovimentar;

        if (valorMovimentar < saldoMedio) {
            System.out.println("Operação Invalida. Saldo insuficiente.");
            System.out.println("Saldo Atual: " + saldoMedio);
        } else {
            System.out.println("Saldo Atual: " + saldoAtual);
        }

    }
}
