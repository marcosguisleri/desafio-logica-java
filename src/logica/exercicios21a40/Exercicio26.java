package logica.exercicios21a40;

public class Exercicio26 {

    void main() {

        double nota1 = Double.parseDouble(IO.readln("Informe a primeira nota do aluno: "));
        double nota2 = Double.parseDouble(IO.readln("Informe a segunda nota do aluno: "));
        double nota3 = Double.parseDouble(IO.readln("Informe a terceira nota do aluno: "));

        double media = (nota1 + nota2 + nota3) / 3;

        IO.println(media >= 6 ? "Aluno aprovado | média: " + media : "Aluno reprovado | média: " + media);

    }

}
