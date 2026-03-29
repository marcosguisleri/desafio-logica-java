package logica.exercicios61a80;

public class Exercicio61 {

    void main() {

        int[] contadores = new int[4];

        while (true) {

            int valor = Integer.parseInt(IO.readln("Informe um valor: "));

            if (valor < 0) break;

            if (valor <= 100) {
                int faixa = valor / 25;
                contadores[faixa]++;
            }
        }

        IO.println("[0-25]: " + contadores[0]);
        IO.println("[26-50]: " + contadores[1]);
        IO.println("[51-75]: " + contadores[2]);
        IO.println("[76-100]: " + contadores[3]);

    }
}

