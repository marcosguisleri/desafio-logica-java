package logica.exercicios101a123;

import java.util.Scanner;

public class Exercicio114 {

    void main() {

        int[] vetorA = new int[50];
        int[] vetorB = new int[50];
        int posicaoA = 0, posicaoB = 49;
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor A: "));
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor B: "));
        }

        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorB[posicaoB] - vetorA[posicaoA];
            posicaoA++;
            posicaoB--;
        }

        IO.println(soma);

    }

}
