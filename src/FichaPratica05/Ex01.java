package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numero = new int[10];
        int i;

        System.out.print("Insira um número no Array[0]: ");
        numero[0] = input.nextInt();
        System.out.print("Insira um número no Array[1]: ");
        numero[1] = input.nextInt();
        System.out.print("Insira um número no Array[2]: ");
        numero[2] = input.nextInt();
        System.out.print("Insira um número no Array[3]: ");
        numero[3] = input.nextInt();
        System.out.print("Insira um número no Array[4]: ");
        numero[4] = input.nextInt();
        System.out.print("Insira um número no Array[5]: ");
        numero[5] = input.nextInt();
        System.out.print("Insira um número no Array[6]: ");
        numero[6] = input.nextInt();
        System.out.print("Insira um número no Array[7]: ");
        numero[7] = input.nextInt();
        System.out.print("Insira um número no Array[8]: ");
        numero[8] = input.nextInt();
        System.out.print("Insira um número no Array[9]: ");
        numero[9] = input.nextInt();

        System.out.println(numero[0]);
        System.out.println(numero[1]);
        System.out.println(numero[2]);
        System.out.println(numero[3]);
        System.out.println(numero[4]);
        System.out.println(numero[5]);
        System.out.println(numero[6]);
        System.out.println(numero[7]);
        System.out.println(numero[8]);
        System.out.println(numero[9]);
    }
}
