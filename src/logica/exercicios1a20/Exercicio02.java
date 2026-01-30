package logica.exercicios1a20;

public class Exercicio02 {

    String nome = IO.readln("Informe um nome: ");
    int idade = Integer.parseInt(IO.readln("Informe a idade: "));
    double salario = Double.parseDouble(IO.readln("Informe o salario: "));

    void apresentar(){
        IO.println("Nome: " + nome);
        IO.println("Idade: " + idade);
        IO.println("Salario: " + salario);
    }

    void main() {

        apresentar();

    }

}
