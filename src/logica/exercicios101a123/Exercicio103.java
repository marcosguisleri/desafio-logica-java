package logica.exercicios101a123;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio103 {

    void main() {

        Integer[] vetorBase = new Integer[10];

        for (int v = 0; v < vetorBase.length; v++) {
            vetorBase[v] = Integer.parseInt(IO.readln("Informe um valor: "));
        }

        Arrays.sort(vetorBase, Collections.reverseOrder());

        IO.println("\n=== ORDEM DECRESCENTE ===");
        for (int v : vetorBase) {
            IO.println(v);
        }

    }
}
