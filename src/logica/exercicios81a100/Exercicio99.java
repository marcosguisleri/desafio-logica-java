package logica.exercicios81a100;

public class Exercicio99 {

    void main() {

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(IO.readln("Informe um valor: "));
        }

        IO.println("\nVetor original:");
        imprimirVetor(vetor);

        for (int i = 0; i < vetor.length / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        IO.println("\nVetor após a troca:");
        imprimirVetor(vetor);
    }

    static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            IO.println("[" + i + "] = " + vetor[i]);
        }
    }
}