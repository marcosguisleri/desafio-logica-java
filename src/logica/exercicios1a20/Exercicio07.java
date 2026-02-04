package logica.exercicios1a20;

public class Exercicio07 {

    void main() {

        double valorGastoReais = Double.parseDouble(IO.readln("Informe o valor Gasto R$: "));
        double precoLitroGasolina = Double.parseDouble(IO.readln("Informe o valor do litro da gasolina R$: "));

        System.out.printf("Foi abastecido: %.1f/L", (valorGastoReais / precoLitroGasolina));

    }

}
