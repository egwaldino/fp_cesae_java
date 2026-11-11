package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Insira um número na Matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");

            }
            System.out.println();
        }

        System.out.println("Insira um numero para pesquisar: ");
        int numero = input.nextInt();
        boolean encontrado = false;
        int contador = 0;
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                
                if (matriz[linha][coluna] == numero) {
                    contador += 1;
                    encontrado = true;
                }
            }
            
        }
        if (!encontrado) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println(
                    "Há " + contador + " posições na matriz com o numero: " + numero);
        }
    }
}
