package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {
        int iniciador = 1, soma = 0;

        while (iniciador <= 100) {
            System.out.println(iniciador);
            soma = soma + iniciador ;
            iniciador = iniciador + 1;

        }
        System.out.println("Somatório: " + soma);
    }
}
