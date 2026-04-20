package logica.exercicios61a80;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercicio68 {

    void main() {

        int idade;
        String sexo;
        BigDecimal salario;

        int quantMulheres100 = 0;
        int maiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;

        BigDecimal somaSalarios = BigDecimal.ZERO;

        int qtd = Integer.parseInt(IO.readln("Informe a quantidade de habitantes: "));

        for (int i = 0; i < qtd; i++) {

            salario = new BigDecimal(IO.readln("Informe o salário: "));
            while (salario.compareTo(BigDecimal.ZERO) < 0) {
                salario = new BigDecimal(IO.readln("O salário não pode ser negativo: "));
            }

            idade = Integer.parseInt(IO.readln("Informe a idade: "));

            sexo = IO.readln("Informe o sexo (M/F): ");

            somaSalarios = somaSalarios.add(salario);

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo.equals("F") && salario.compareTo(new BigDecimal("100.00")) <= 0) {
                quantMulheres100++;
            }

            IO.println("------------------");
        }

        BigDecimal media = somaSalarios.divide(
                new BigDecimal(qtd), 2, RoundingMode.HALF_UP
        );

        IO.println("\nRESULTADOS:");
        IO.println("Média salarial do grupo: R$ " + media);
        IO.println("Maior idade do grupo: " + maiorIdade);
        IO.println("Menor idade do grupo: " + menorIdade);
        IO.println("Quantidade de mulheres com salário até R$100,00: " + quantMulheres100);
    }
}