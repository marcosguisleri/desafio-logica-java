package logica.exercicios1a20;

public class Exercicio05 {

    void main() {

        double precoDeFabrica = Double.parseDouble(IO.readln("Informe o valor de fábrica do carro em R$: "));

        System.out.printf("O valor final do carro(Consumidor) é: R$ %.2f", (precoDeFabrica + (precoDeFabrica * 0.25) + (precoDeFabrica * 0.45)));

    }

}
