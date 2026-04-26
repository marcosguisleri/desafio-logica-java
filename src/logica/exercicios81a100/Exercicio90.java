package logica.exercicios81a100;

public class Exercicio90 {

    void main() {

        for (int i = 1; i <= 75; i++) {

            String matricula = IO.readln("Informe a matrícula: ");
            double nota = Double.parseDouble(IO.readln("Informe a nota final: "));

            int faixa = (int) nota;
            String conceito = switch (faixa) {
                case 0, 1, 2, 3, 4 -> "D";
                case 5, 6 -> "C";
                case 7, 8 -> "B";
                case 9, 10 -> "A";
                default -> "Nota inválida";
            };

            IO.println("Matrícula: " + matricula);
            IO.println("Conceito: " + conceito);
        }

    }
}
