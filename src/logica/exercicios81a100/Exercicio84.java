package logica.exercicios81a100;

public class Exercicio84 {

    void main() {

        double nota1, nota2, nota3;
        double somaMedias = 0.0;
        double mediaAluno;

        for (int i = 1; i <= 50; i++) {

            IO.println("\nAluno " + i);

            nota1 = Double.parseDouble(IO.readln("Informe a primeira nota: "));
            nota2 = Double.parseDouble(IO.readln("Informe a segunda nota: "));
            nota3 = Double.parseDouble(IO.readln("Informe a terceira nota: "));

            mediaAluno = (nota1 * 2 + nota2 * 5 + nota3 * 3) / 10.0;

            IO.println("-----------------");
            IO.println("Média do aluno: " + mediaAluno);
            IO.println(mediaAluno >= 7 ? "Aprovado" : "Reprovado");
            IO.println("-----------------");

            somaMedias += mediaAluno;
        }

        double mediaGeral = somaMedias / 50;

        IO.println("\n-----------------");
        IO.println("Média geral da turma: " + mediaGeral);
    }
}