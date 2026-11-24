package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFicheiros {
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    public static void escreverFicheiros(String caminho) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        File ficheiro = new File(caminho);
        PrintWriter printWriter = new PrintWriter(ficheiro);

        System.out.println("Qual é o conteudo do ficheiro?");
        String conteudo = input.nextLine();

        printWriter.println(caminho);
        printWriter.println(conteudo);

        printWriter.close();
    }

    public static void criarFicheiros(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        PrintWriter printWriter = new PrintWriter(ficheiro);

        printWriter.close();
    }
}
