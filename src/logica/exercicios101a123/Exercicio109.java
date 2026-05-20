package logica.exercicios101a123;

public class Exercicio109 {

    void main() {

        int[] x = new int[20];

        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(IO.readln("Informe um valor: "));
        }

        IO.println("\nVetor X:");
        for (int valor : x) {
            IO.println(valor);
        }

        IO.println("\nValores distintos e quantidade de vezes:");

        for (int i = 0; i < x.length; i++) {

            boolean jaFoiContado = false;

            for (int j = 0; j < i; j++) {
                if (x[i] == x[j]) {
                    jaFoiContado = true;
                    break;
                }
            }

            if (!jaFoiContado) {
                int quantidade = 0;

                for (int j = 0; j < x.length; j++) {
                    if (x[i] == x[j]) {
                        quantidade++;
                    }
                }

                IO.println("Valor " + x[i] + " aparece " + quantidade + " vez(es).");
            }
        }
    }
}
