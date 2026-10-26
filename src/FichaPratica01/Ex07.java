package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, total, desconto;

        System.out.print("Digite o preço do primeiro produto: ");
        preco1 = input.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        preco2 = input.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        preco3 = input.nextDouble();

        total = preco1 + preco2 + preco3;
        desconto = total * 0.9;

        System.out.println("O valor total a pagar é de: " + total);
        System.out.println("Aproveitando o nosso desconto de 10% o valor final a pagar passa para: " + desconto);

    }
}
