package logica.exercicios21a40;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class Exercicio32a {

    void main() {

        Map<Integer, BigDecimal> precos = Map.of(
                100, new BigDecimal("1.20"),
                101, new BigDecimal("1.30"),
                102, new BigDecimal("1.50"),
                103, new BigDecimal("1.20"),
                104, new BigDecimal("1.30"),
                105, new BigDecimal("1.00")
        );

        int codigo = Integer.parseInt(IO.readln("Informe o código do produto: "));
        int quantidade = Integer.parseInt(IO.readln("Informe a quantidade: "));

        BigDecimal preco = precos.get(codigo);

        if (preco == null) {
            IO.println("Código invalido: " + codigo);
            return;
        }

        BigDecimal total =  preco.multiply(BigDecimal.valueOf(quantidade)).setScale(2, RoundingMode.HALF_UP);

        IO.println("Total: R$ " + total);

    }

}
