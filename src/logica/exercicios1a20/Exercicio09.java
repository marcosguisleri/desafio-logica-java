package logica.exercicios1a20;

public class Exercicio09 {

    void main() {

        double notaAluno1 = Double.parseDouble(IO.readln("Informe a primeira nota do aluno: "));
        double notaAluno2 = Double.parseDouble(IO.readln("Informe a segunda nota do aluno: "));
        double notaAluno3 = Double.parseDouble(IO.readln("Informe a terceira nota do aluno: "));

        System.out.printf("A média final do aluno é: %.2f", ((notaAluno1 + (notaAluno2 * 2) + (notaAluno3 * 3)) / 6));

    }

}
