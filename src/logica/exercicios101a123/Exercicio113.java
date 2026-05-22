package logica.exercicios101a123;

public class Exercicio113 {

    void main() {

        int[] vetor = new int[80];
        int menorValor = Integer.MAX_VALUE;
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(IO.readln("Informe um valor: "));
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
                posicao = i;
            }
        }

        IO.println("\n Menor valor: " + menorValor + " | Posição: " + posicao + 1);

    }

}
