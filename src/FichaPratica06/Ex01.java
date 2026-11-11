package FichaPratica06;

import java.util.Scanner;

public class Ex01 {
    static void fazerBarulho(String opcao) {
        switch (opcao) {
            case "Cão":
                System.out.println("Au au au");
                break;

            case "Gato":
                System.out.println("Miau");
                break;

            case "Peixe":
                System.out.println("Glub Glub");
                break;

            case "Vaca":
                System.out.println("Muuuu");
                break;

            case "Porco":
                System.out.println("Oinc oinc");
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String animal;
        
        System.out.println("Introduza um animal: ");
        animal = input.nextLine();
        fazerBarulho(animal);

    }
}
