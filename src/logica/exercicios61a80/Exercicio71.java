package logica.exercicios61a80;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercicio71 {

    void main() {

        int quantProdutos = 0;

        BigDecimal somaOriginal = BigDecimal.ZERO;
        BigDecimal somaAlterada = BigDecimal.ZERO;
        final BigDecimal percentualAjuste = new BigDecimal("0.20");

        while (true) {

            int codigoProduto = Integer.parseInt(IO.readln("\nInforme o código do produto: "));

            if (codigoProduto < 0) {
                IO.println("\nEncerrando leitura de dados...");
                break;
            }

            BigDecimal valorProduto = new BigDecimal(IO.readln("Informe o valor do produto em R$: "));

            BigDecimal valorAjustado = valorProduto.multiply(percentualAjuste).add(valorProduto);

            somaOriginal = somaOriginal.add(valorProduto);
            somaAlterada = somaAlterada.add(valorAjustado);

            quantProdutos++;

            IO.println("\n-----------------");
            IO.println("Novo Produto Cadastrado");
            IO.println("Código: " + codigoProduto);
            IO.println("Novo Valor Após Reajuste de 20%: R$ " + valorAjustado);
            IO.println("-----------------");

        }

        if (quantProdutos == 0) {
            IO.println("\n-----------------");
            IO.println("Nenhum produto foi cadastrado");
        } else {
            BigDecimal divisor = new BigDecimal(quantProdutos);
            BigDecimal mediaOriginal = somaOriginal.divide(divisor, 2, RoundingMode.HALF_UP);
            BigDecimal mediaAlterada = somaAlterada.divide(divisor, 2, RoundingMode.HALF_UP);

            IO.println("\n-----------------");
            IO.println("Média dos Preços sem Aumento: R$ " + mediaOriginal);
            IO.println("Média dos Preços com Aumento de 20%: R$ " + mediaAlterada);
        }

    }
}
