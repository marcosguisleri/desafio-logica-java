package logica.exercicios21a40;

import java.util.HashMap;
import java.util.Map;

public class Exercicio38 {

    void main() {

        Map<String, Double> mapa = new HashMap<>();
        mapa.put("Gerente", 0.10);
        mapa.put("Engenheiro", 0.20);
        mapa.put("Técnico", 0.30);

        String cargoFuncionario = IO.readln("Informe o cargo do funcionário: ");
        double salarioFuncionario = Double.parseDouble(IO.readln("Informe o salário do funcionário: R$ "));

        IO.println("Salário antigo: R$ " + salarioFuncionario);
        IO.println("Salário com aumento: R$ " + (salarioFuncionario + (salarioFuncionario * mapa.get(cargoFuncionario))));

    }
}
