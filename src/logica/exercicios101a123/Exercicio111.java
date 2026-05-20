package logica.exercicios101a123;

public class Exercicio111 {

    void main() {

        int[] a = new int[100];
        int[] b = new int[100];
        int cont = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor A: "));

            if (a[i] > 0) {
                b[cont] = a[i];
                cont++;
            }
        }

        IO.println("\nVetor B: ");
        for (int i = 0; i < cont; i++) {
            IO.println(b[i]);
        }
    }
}
