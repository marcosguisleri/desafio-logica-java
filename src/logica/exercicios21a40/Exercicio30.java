package logica.exercicios21a40;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio30 {

    void main() {

        int ra = Integer.parseInt(IO.readln("Informe o RA: "));

        double n1 = Double.parseDouble(IO.readln("Informe a primeira nota: "));
        double n2 = Double.parseDouble(IO.readln("Informe a segunda nota: "));
        double n3 = Double.parseDouble(IO.readln("Informe a terceira nota: "));

        double maiorNota = Math.max(n1, Math.max(n2, n3));

        double media = (maiorNota * 4 + (n1 + n2 + n3 - maiorNota) * 3) / 10.0;

        IO.println("\n--- Resultado ---");
        IO.println("RA: " + ra);
        IO.println("Nota 1: " + n1);
        IO.println("Nota 2: " + n2);
        IO.println("Nota 3: " + n3);
        IO.println("Média Ponderada: " + media);

        if (media >= 5) {
            IO.println("Situação: APROVADO");
        } else {
            IO.println("Situação: REPROVADO");
        }

    }

}
