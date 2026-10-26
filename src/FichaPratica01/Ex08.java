package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m1, s1, m2, s2, m3, s3, m4, s4, m5, s5, totalAlbum, totalMinutos, totalSegundos, horasFinais, minutosFinais, segundosFinais;

        System.out.print("Introduza os minutos da música 1: ");
        m1 = input.nextInt();

        System.out.print("Introduza os segundos da música 1: ");
        s1 = input.nextInt();

        System.out.print("Introduza os minutos da música 2: ");
        m2 = input.nextInt();

        System.out.print("Introduza os segundos da música 2: ");
        s2 = input.nextInt();

        System.out.print("Introduza os minutos da música 3: ");
        m3 = input.nextInt();

        System.out.print("Introduza os segundos da música 3: ");
        s3 = input.nextInt();

        System.out.print("Introduza os minutos da música 4: ");
        m4 = input.nextInt();

        System.out.print("Introduza os segundos da música 4: ");
        s4 = input.nextInt();

        System.out.print("Introduza os minutos da música 5: ");
        m5 = input.nextInt();

        System.out.print("Introduza os segundos da música 5: ");
        s5 = input.nextInt();

        totalMinutos = m1 + m2 + m3 + m4 + m5;
        totalSegundos = s1 + s2 + s3 + s4 + s5;

        totalAlbum = (totalMinutos * 60 + totalSegundos);

        horasFinais = (totalAlbum / 3600);
        minutosFinais = (totalAlbum % 3600) / 60;
        segundosFinais = totalAlbum % 60;

        System.out.print("Total do Álbum: " + horasFinais + "h " + minutosFinais + "m " + segundosFinais + "s");

    }
}
