package logica.exercicios61a80;

public class Exercicio73 {

    void main() {

        int maiorValor = 0;
        int menorValor = Integer.MAX_VALUE;
        double somaValores = 0.0;

        for (int i = 0; i < 500; i++) {
            int x = Integer.parseInt(IO.readln());

            if (x > maiorValor) {
                maiorValor = x;
            }

            if (x < menorValor) {
                menorValor =x;
            }

            somaValores += x;
        }

        IO.println("Maior valor: " + maiorValor);
        IO.println("Menor valor: " + menorValor);
        IO.println("Média dos valores: " + somaValores / 500.0);
    }
}
