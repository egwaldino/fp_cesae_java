package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu; 

        System.out.print("Escolhe uma das opções válidas do menu: ");
        menu = input.next();

        switch (menu) {
            case "1":
                System.out.println("Opção escolhida: Criar");
                break;

            case "2":
                System.out.println("Opção escolhida: Atualizar");
                break;

            case "3":
                System.out.println("Opção escolhida: Eliminar");
                break;

            case "4":
                break;
        
            default:
                System.out.println("Opção Inválida, escolhe uma opção (1-4)");
                break;
        }
    }
}
