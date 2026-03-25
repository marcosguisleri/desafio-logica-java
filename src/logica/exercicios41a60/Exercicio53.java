package logica.exercicios41a60;

public class Exercicio53 {

    void main() {

        while (true) {

            int codigoAluno = Integer.parseInt(IO.readln("Informe o código do aluno: "));

            if (codigoAluno == 0) {
                IO.println("Encerrando o programa...");
                break;
            }

            double nota1 = Double.parseDouble(IO.readln("Informe a primeira nota: "));
            double nota2 = Double.parseDouble(IO.readln("Informe a segunda nota: "));
            double nota3 = Double.parseDouble(IO.readln("Informe a terceira nota: "));

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.printf("Média do aluno %d: %.2f%n\n", codigoAluno, media);

        }

    }
}
