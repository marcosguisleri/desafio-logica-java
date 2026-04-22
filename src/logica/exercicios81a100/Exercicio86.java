package logica.exercicios81a100;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio86 {

    void main() {

        List<Integer> valores = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            IO.println("\nGrupo " + i);

            valores.add(Integer.parseInt(IO.readln("Informe A: ")));
            valores.add(Integer.parseInt(IO.readln("Informe B: ")));
            valores.add(Integer.parseInt(IO.readln("Informe C: ")));
            valores.add(Integer.parseInt(IO.readln("Informe D: ")));
        }

        IO.println("\n--------------");
        IO.println("Ordem lida:");
        valores.forEach(IO::println);

        IO.println("\n--------------");
        IO.println("Ordem decrescente:");
        valores.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(IO::println);
    }
}