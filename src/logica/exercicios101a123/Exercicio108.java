package logica.exercicios101a123;

public class Exercicio108 {

    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void main(String[] args) {

        int[] k = new int[15];
        int[] p = new int[15];
        int cont = 0;

        for (int i = 0; i < k.length; i++) {
            k[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor: "));
        }

        IO.println("\nVetor K\n");
        for (int i : k) {
            IO.println(i);
        }

        for (int i = 0; i < k.length; i++) {
            if (ehPrimo(k[i])) {
                p[cont] = k[i];
                cont++;
            }
        }

        IO.println("\nVetor P (somente primos)\n");
        for (int i = 0; i < cont; i++) {
            IO.println(p[i]);
        }
    }
}