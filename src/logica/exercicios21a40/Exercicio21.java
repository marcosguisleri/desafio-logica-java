package logica.exercicios21a40;

public class Exercicio21 {

    void main() {

        int quantPaes = Integer.parseInt(IO.readln("Informe quantos pães foram vendidos: "));
        int quantBroas = Integer.parseInt(IO.readln("Informe quantas broas foram vendidas: "));

        double valorVendas = (quantPaes * 0.35)  + (quantBroas * 1.50);
        double valorPoupanca = valorVendas * 0.10;

        IO.println("Valor total de vendas do dia: R$ " + valorVendas);
        IO.println("Valor para guardar na poupança: R$ " + valorPoupanca);

    }

}
