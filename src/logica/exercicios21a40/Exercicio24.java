package logica.exercicios21a40;

public class Exercicio24 {

    void main() {

        double nota1 = Double.parseDouble(IO.readln("Informe a primeira nota: "));
        double nota2 = Double.parseDouble(IO.readln("Informe a segunda nota: "));
        double nota3 = Double.parseDouble(IO.readln("Informe a terceira nota: "));

        IO.println("Média final do aluno: " + (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10));

    }

}
