package logica.exercicios81a100;

public class Exercicio97 {

    void main() {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorAuxiliar = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor 1: "));
            vetor2[i] = Integer.parseInt(IO.readln("Informe um valor para o vetor 2: "));

            vetorAuxiliar[i] = vetor1[i] * vetor2[i];
        }

        for (int item : vetorAuxiliar) {
            IO.print(item + " ");
        }

    }

}
