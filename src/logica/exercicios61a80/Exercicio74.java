package logica.exercicios61a80;

public class Exercicio74 {

    void main() {

        int n = Integer.parseInt(IO.readln("Informe um valor inteiro e positivo: "));
        double soma = 0.0;

        IO.println("Termos da soma:");

        for (int i = 1; i <= n; i++) {
            double termo = 1.0 / i;
            IO.println("1/" + i + " = " + termo);
            soma += termo;
        }

        IO.println("\nValor final de S: " + soma);
    }
}