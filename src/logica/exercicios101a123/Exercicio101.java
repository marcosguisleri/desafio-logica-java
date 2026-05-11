package logica.exercicios101a123;

public class Exercicio101 {

    void main() {

        int[] vetorBase = new int[10];
        int[] vetorPosicaoPar = new int[5];
        int[] vetorPosicaoImpar = new int[5];

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < vetorBase.length; i++) {
            vetorBase[i] = Integer.parseInt(
                    IO.readln("Informe um valor para o vetor base: ")
            );

            if (i % 2 == 0) {
                vetorPosicaoPar[contPar++] = vetorBase[i];
            } else {
                vetorPosicaoImpar[contImpar++] = vetorBase[i];
            }
        }

        IO.println("\n=== VETOR BASE ===");
        for (int v : vetorBase) {
            IO.println(v);
        }

        IO.println("\n=== ELEMENTOS DAS POSIÇÕES PARES ===");
        for (int v : vetorPosicaoPar) {
            IO.println(v);
        }

        IO.println("\n=== ELEMENTOS DAS POSIÇÕES ÍMPARES ===");
        for (int v : vetorPosicaoImpar) {
            IO.println(v);
        }
    }
}