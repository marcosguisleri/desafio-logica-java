package logica.exercicios41a60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio41 {

    void main() {

        int i = Integer.parseInt(IO.readln("Informe um valor inteiro: "));
        double a = Double.parseDouble(IO.readln("Informe um valor real: "));
        double b = Double.parseDouble(IO.readln("Informe outro valor real: "));
        double c = Double.parseDouble(IO.readln("Informe mais um valor real: "));

        List<Double> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);

        if (i == 1) {
            Collections.sort(lista);
            IO.println(lista);
        } else if (i == 2) {
            lista.sort(Collections.reverseOrder());
            IO.println(lista);
        } else {
            Collections.sort(lista);
            double maior = lista.remove(2);
            lista.add(1, maior);
            IO.println(lista);
        }

    }
}
