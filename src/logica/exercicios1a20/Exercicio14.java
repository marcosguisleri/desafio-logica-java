package logica.exercicios1a20;

public class Exercicio14 {

    void main() {

        double saldoCliente = 500.00;

        double chequeCompensado = Double.parseDouble(IO.readln("Informe o valor do cheque compensado: R$ "));

        IO.println("Novo saldo: R$ " + (saldoCliente + chequeCompensado));

    }

}