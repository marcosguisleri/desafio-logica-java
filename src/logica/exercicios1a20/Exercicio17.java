package logica.exercicios1a20;

public class Exercicio17 {

    void main() {

        int numeroTotalPrestacoes = Integer.parseInt(IO.readln("Informe o valor total de parcelas: "));
        int quantPrestacoesPagas = Integer.parseInt(IO.readln("Informe o valor de prestações pagas: "));
        double valorPrestacao = Double.parseDouble(IO.readln("Informe o valor atual da prestação: R$ "));

        double totalPago = quantPrestacoesPagas * valorPrestacao;
        double saldoDevedor = (numeroTotalPrestacoes - quantPrestacoesPagas) * valorPrestacao;

        IO.println("Valor total pago: R$ " + totalPago);
        IO.println("Saldo devedor: R$ " + saldoDevedor);

    }

}
