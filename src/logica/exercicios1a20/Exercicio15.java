package logica.exercicios1a20;

public class Exercicio15 {

    void main() {

        double salarioFixoVendedor = 800.00;

        double valorVendasMensalVendedor = Double.parseDouble(IO.readln("Informe o valor total de vendas do vendedor no mês: R$ "));

        IO.println("Salário final do funcionário: R$ " +  (salarioFixoVendedor + (valorVendasMensalVendedor * 0.15)));

    }

}
