package logica.exercicios1a20;

public class Exercicio01 {

    void main() {

        double nota1 = Double.parseDouble(IO.readln("Informe a primeira nota do aluno: "));
        double nota2 = Double.parseDouble(IO.readln("Informe a segunda nota do aluno: "));

        IO.print("A média aritmética do aluno é: " + ((nota1 + nota2) / 2));

    }

}
