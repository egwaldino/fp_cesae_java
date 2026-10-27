package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String lugarDoPiloto;

        System.out.print("Introduza o seu lugar na corrida: ");
        lugarDoPiloto = input.next();

        switch (lugarDoPiloto) {
            case "1":
                System.out.println("1.º lugar: 10 pontos");
                break;

            case "2":
                System.out.println("2.º lugar: 8 pontos");
                break;

            case "3":
                System.out.println("3.º lugar: 6 pontos");
                break;

            case "4":
                System.out.println("4.º lugar: 5 pontos");
                break;

            case "5":
                System.out.println("5.º lugar: 4 pontos");
                break;

            case "6":
                System.out.println("6.º lugar: 3 pontos");
                break;

            case "7":
                System.out.println("7.º lugar: 2 pontos");
                break;

            case "8":
                System.out.println("8.º lugar: 1 ponto");
                break;

            default:
                System.out.println("Não ganhou pontos.");

        }
    }
}
