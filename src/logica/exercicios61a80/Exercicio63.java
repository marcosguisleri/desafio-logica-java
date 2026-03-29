package logica.exercicios61a80;

public class Exercicio63 {

    void main() {

        while (true) {

            int m = Integer.parseInt(IO.readln("Informe m (positivo): "));
            int n = Integer.parseInt(IO.readln("Informe n (positivo): "));

            if (m <= 0 || n <= 0) {
                IO.println("Encerrando...");
                break;
            }


            int soma = n * (2 * m + (n - 1)) / 2;

            IO.println("Soma dos " + n + " inteiros consecutivos a partir de " + m + ": " + soma);

        }
    }
}
