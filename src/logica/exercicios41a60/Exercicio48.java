package logica.exercicios41a60;

import java.math.BigDecimal;

public class Exercicio48 {

    public static void main(String[] args) {

        int quantPessoas = 0;
        int pessoasSalarioAte100 = 0;
        int totalFilhos = 0;
        double totalSalarios = 0.0;
        double maiorSalario = Double.MIN_VALUE;

        while (true) {
            BigDecimal valor = new BigDecimal(IO.readln("Informe o salário: "));

            if (valor.compareTo(BigDecimal.ZERO) < 0) {
                break;
            }

            quantPessoas++;
            double salario = valor.doubleValue();
            totalSalarios += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            int numeroFilhos = Integer.parseInt(IO.readln("Informe a quantidade de filhos: "));
            totalFilhos += numeroFilhos;

            if (salario <= 100.0) {
                pessoasSalarioAte100++;
            }
        }

        if (quantPessoas > 0) {
            double mediaSalarios = totalSalarios / quantPessoas;
            double mediaFilhos = (double) totalFilhos / quantPessoas;
            double percentualSalarioAte100 = ((double) pessoasSalarioAte100 / quantPessoas) * 100;

            IO.println("Média de salário: " + mediaSalarios);
            IO.println("Média de filhos: " + mediaFilhos);
            IO.println("Maior salário: " + maiorSalario);
            IO.println("Percentual de pessoas com salário até R$100: " + percentualSalarioAte100 + "%");
        } else {
            IO.println("Nenhum dado válido foi informado.");
        }
    }
}
