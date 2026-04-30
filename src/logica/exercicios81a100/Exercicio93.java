package logica.exercicios81a100;

public class Exercicio93 {

    void main() {

        int inicio = 120;
        int encontrados = 0;
        int limite = 20;

        IO.println("Os " + limite + " primeiros números primos a partir de " + inicio + " são:");

        while (encontrados < limite) {
            if (ehPrimo(inicio)) {
                IO.print(inicio + " ");
                encontrados++;
            }
            inicio++;
        }
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}

