package logica.exercicios21a40;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class Exercicio32b {

    void main() {

        Map<Integer, BigDecimal> precos = Map.of(
                100, new BigDecimal("1.20"),
                101, new BigDecimal("1.30"),
                102, new BigDecimal("1.50"),
                103, new BigDecimal("1.20"),
                104, new BigDecimal("1.30"),
                105, new BigDecimal("1.00")
        );

        BigDecimal total = BigDecimal.ZERO;

        while (true) {
            IO.println("""
                    1 - Adicionar pedido
                    2 - Fechar pedido
                    """);

            int opcao = Integer.parseInt(IO.readln("Informe a opção desejada: "));

            if (opcao == 2) {
                break;
            }

            if (opcao != 1) {
                IO.println("Opção inválida!");
                continue;
            }

            int codigo = Integer.parseInt(IO.readln("Informe o código do produto: "));
            int quantidade = Integer.parseInt(IO.readln("Informe a quantidade: "));

            if (quantidade <= 0) {
                IO.println("Quantidade inválida!");
                continue;
            }

            BigDecimal preco = precos.get(codigo);

            if (preco == null) {
                IO.println("Código inválido: " + codigo);
                continue;
            }

            BigDecimal subtotal = preco.multiply(BigDecimal.valueOf(quantidade))
                    .setScale(2, RoundingMode.HALF_UP);

            total = total.add(subtotal);

            IO.println("Subtotal do item: R$ " + subtotal);
        }

        total = total.setScale(2, RoundingMode.HALF_UP);
        IO.println("Total: R$ " + total);
    }
}