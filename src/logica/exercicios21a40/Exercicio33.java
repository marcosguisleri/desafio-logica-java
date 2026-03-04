package logica.exercicios21a40;

public class Exercicio33 {

    void main() {

        double altura = Double.parseDouble(IO.readln("Informe a altura (em metros): "));
        String sexo = IO.readln("Informe seu sexo: M = Masculino F = Feminino: ");

        if (altura <= 0) {
            IO.println("Altura inválida!");
            return;
        }

        double pesoIdeal;

        if (sexo.equals("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equals("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Sexo invalido. Use M ou F.");
            return;
        }

        System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);

    }

}
