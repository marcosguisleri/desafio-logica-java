package logica.exercicios1a20;

public class Exercicio07 {

    void main() {

        var precoQuiloRefeicao = 14.0;
        double PesoPrato = Double.parseDouble(IO.readln("Digite o peso do prato em KG: "));

        System.out.printf("O preço a ser pago é: R$ %.2f\n", precoQuiloRefeicao * PesoPrato);

    }

}
