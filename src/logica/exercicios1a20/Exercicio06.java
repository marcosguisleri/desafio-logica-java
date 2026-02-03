package logica.exercicios1a20;

public class Exercicio06 {

    void main() {

        double precoLitroGasolina = Double.parseDouble(IO.readln("Informe o valor do litro da gasolina em R$: "));
        double valorTotalPago = Double.parseDouble(IO.readln("Informe o valor total pago em R$: "));

        IO.println("Total de litros abastecido: " + String.format("%.2f", (valorTotalPago / precoLitroGasolina)));

    }

}
