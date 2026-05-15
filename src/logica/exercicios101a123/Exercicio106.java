package logica.exercicios101a123;

public class Exercicio106 {

    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    void main() {

        int[] X = new int[10];
        int numero = 101;
        int count = 0;

        while (count < 10) {
            if (ehPrimo(numero)) {
                X[count] = numero;
                count++;
            }
            numero++;
        }

        IO.println("Os 10 primeiros primos acima de 100:");
        for (int i = 0; i < 10; i++) {
            IO.println(X[i]);
        }

    }

}
