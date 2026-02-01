package logica.exercicios1a20;

public class Exercicio02 {

    void apresentarPessoa(String nome, int idade, double salario) {
        IO.println("Nome: " + nome);
        IO.println("Idade: " + idade);
        IO.println("Salario: R$ " + salario);
    }

    void main() {

        String nome = IO.readln("Informe um nome: ");
        int idade = Integer.parseInt(IO.readln("Informe a idade: "));
        double salario = Double.parseDouble(IO.readln("Informe um salario em R$: "));

        apresentarPessoa(nome, idade, salario);

    }
}
