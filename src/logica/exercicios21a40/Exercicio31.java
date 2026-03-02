package logica.exercicios21a40;

public class Exercicio31 {

    void main() {

        int x = Integer.parseInt(IO.readln("Informe um valor inteiro: "));

        if (x > 0) {
            IO.println((x % 2 == 0) ? "Número positivo e par!" : "Número positivo e ímpar!");
        } else if (x < 0) {
            IO.println((x % 2 == 0) ? "Número negativo e par!" : "Número negativo e ímpar!");
        } else {
            IO.println("Número invalido: " + x);
        }

    }

}
