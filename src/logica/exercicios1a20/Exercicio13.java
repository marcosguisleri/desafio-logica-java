package logica.exercicios1a20;

public class Exercicio13 {

    void main() {

        double nota1 = Double.parseDouble(IO.readln("Informe a nota da primeira prova: "));
        double nota2 = Double.parseDouble(IO.readln("Informe a nota da segunda prova: "));
        double nota3 = Double.parseDouble(IO.readln("Informe a nota da terceira prova: "));

        System.out.println("A média final do aluno é: " + (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10));

    }

}
