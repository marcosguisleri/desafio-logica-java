package logica.exercicios101a123;

public class Exercicio104 {

    void main() {

        int[] vetorOriginal = new int[12];
        int[] vetorClone = new int[12];

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = Integer.parseInt(IO.readln("Informe um valor: "));

            if (vetorOriginal[i] == 0) {
                vetorClone[i] = 1;
            } else {
                vetorClone[i] = vetorOriginal[i];
            }
        }

        IO.println("\n=== VETOR ORIGINAL ===");
        for (Integer valor : vetorOriginal) {
            IO.print(valor + " ");
        }

        IO.println("\n=== VETOR CLONE ===");
        for (Integer valor : vetorClone) {
            IO.print(valor + " ");
        }

    }
}
