package logica.exercicios41a60;

public class Exercicio56 {

    void main() {

        while (true) {

            int codigoAluno = Integer.parseInt(IO.readln("Informe o código do aluno: "));

            if (codigoAluno < 1) {
                IO.println("Encerrando o programa...");
                break;
            }

            double nota1 = Double.parseDouble(IO.readln("Informe a primeira nota do aluno: "));
            double nota2 = Double.parseDouble(IO.readln("Informe a segunda nota do aluno: "));
            double nota3 = Double.parseDouble(IO.readln("Informe a terceira nota do aluno: "));

            double maiorNota = Math.max(nota1, Math.max(nota2, nota3));

            double media = 0.0;

            if (maiorNota == nota1) {
                media = ((nota1 * 4) + (nota2 * 3) + (nota3 * 3)) / 10.0;
            } else if (maiorNota == nota2) {
                media = ((nota1 * 3) + (nota2 * 4) + (nota3 * 3)) / 10.0;
            } else {
                media = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / 10.0;
            }

            IO.println("\nCódigo do aluno: " + codigoAluno);
            IO.println("Nota 1: " + nota1 + " | Nota 2: " + nota2 + " | Nota 3: " + nota3);
            IO.println("Média das três notas: " + media);

            if (media >= 5) {
                IO.println("APROVADO\n");
            } else {
                IO.println("REPROVADO\n");
            }

        }

    }
}
