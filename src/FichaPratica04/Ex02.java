package FichaPratica04;

public class Ex02 {
    public static void main(String[] args) {
        int i, somatorio = 0;

        for (i = 11; i <= 51; i++ ) {
            System.out.println(i);
            somatorio += i;
            i += 1;
        }
        System.out.println("Somatório: " + somatorio);
    }
}
