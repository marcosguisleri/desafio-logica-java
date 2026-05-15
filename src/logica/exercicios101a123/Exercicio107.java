package logica.exercicios101a123;

import java.util.Arrays;

public class Exercicio107 {

    void main() {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorFinal = new int[20];

        int cont = 0;

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor 1: "));
            vetorFinal[cont] = vetor1[i];
            cont++;
        }

        IO.println();
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor 2: "));
            vetorFinal[cont] = vetor2[i];
            cont++;
        }

        Arrays.sort(vetorFinal);

        IO.println("\n Vetor Final: ");
        for (int j : vetorFinal) {
            IO.println(j);
        }

    }
}
