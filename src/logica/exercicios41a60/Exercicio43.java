package logica.exercicios41a60;

public class Exercicio43 {

    void main() {

        double porcentagemIpi = Double.parseDouble(IO.readln("Informe a porcentagem do IPI: "));

        int idPeca1 = Integer.parseInt(IO.readln("Informe o código da primeira peça: "));
        double valorPeca1 = Double.parseDouble(IO.readln("Informe o valor unitário da peça: R$ "));
        int quantPeca1 = Integer.parseInt(IO.readln("Informe a quantidade da peça 1: "));

        int idPeca2 = Integer.parseInt(IO.readln("Informe o código da segunda peça: "));
        double valorPeca2 = Double.parseDouble(IO.readln("Informe o valor unitário da peça: R$ "));
        int quantPeca2 = Integer.parseInt(IO.readln("Informe a quantidade da peça 2: "));

        double valorTotal = (valorPeca1 * quantPeca1 + valorPeca2 * quantPeca2) * (porcentagemIpi / 100 + 1);

        IO.println("Valor total do IPI: R$ " + valorTotal);

    }
}
