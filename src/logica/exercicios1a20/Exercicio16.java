package logica.exercicios1a20;

public class Exercicio16 {

    void main() {

        String nome = IO.readln("Informe o nome do funcionário: ");
        double salarioBruto = Double.parseDouble(IO.readln("Informe o salário bruto do funcionário: R$ "));

        IO.println();

        IO.println("Funcionário: " + nome);
        IO.println("Salário Bruto: R$ " + salarioBruto);
        IO.println("Valor Desconto INSS: R$ " + (salarioBruto * 0.085));
        IO.println("Salário liquído: R$ " +  (salarioBruto - (salarioBruto * 0.085)));

    }

}
