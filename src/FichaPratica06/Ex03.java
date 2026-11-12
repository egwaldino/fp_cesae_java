package FichaPratica06;

public class Ex03 {

    /**
     * Função para determinar se o numero passado por argumento é par ou ímpar
     *
     * @param num
     * @return True se o número for par e false se não for
     */
    static boolean par(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função para determinar se o numero passado por argumento
     * é positivo ou negativo
     * @param num
     * @return True se o número for positivo e false se não for
     */
    static boolean positivo(int num) {
        if (num < 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Função para determinar se o numero passado por argumento é primo ou não
     * @param num
     * @return True se o número for primo e false se não for
     */
    static boolean primo(int num) {
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Função para determinar se o numero passado por argumento é perfeito ou não
     * @param num
     * @return True se o número for perfeito e false se não for
     */
    static boolean perfeito(int num) {
        int soma = 0;
        for(int i = 1; num > soma; i++){
            if (num % i == 0) {
                soma += i;
            }
        }
        if(num == soma) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função para determinar se o numero passado por argumento é triangular ou não
     * @param num
     * @return True se o número for triangular e false se não for
     */
    static boolean triangular(int num) {
        int soma = 0;
        for (int i = 1; soma < num; i++) {
            soma += i;

            if (soma == num) {
                return true;
            }
        }
        return false;
    }

}
