package FichaPratica04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;

        do {
            System.out.println("Opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4.Sair");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Criar");
                    break;

                case 2:
                    System.out.println("Atualizar");
                    break;

                case 3:
                    System.out.println("Eliminar");
                    break;

                case 4:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;

            }
        } while (menu != 4);
    }
}
