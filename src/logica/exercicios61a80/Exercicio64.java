package logica.exercicios61a80;

public class Exercicio64 {

   void main() {

        while (true) {
            int m = Integer.parseInt(IO.readln("Digite um numero positivo (0 para sair): "));

            if (m == 0) {
                IO.println("Programa encerrado.");
                break;
            }

            if (m % 2 == 0) {
                int divisores = 0;

                for (int i = 1; i <= m; i++) {
                    if (m % i == 0) {
                        divisores++;
                    }
                }

                IO.println("O numero " + m + " e par e possui " + divisores + " divisores.");

            } else if (m < 10) {
                long fatorial = 1;

                for (int i = 1; i <= m; i++) {
                    fatorial *= i;
                }

                IO.println("O numero " + m + " e impar e seu fatorial e: " + fatorial);

            } else {
                int soma = 0;

                for (int i = 1; i <= m; i++) {
                    soma += i;
                }

                IO.println("O numero " + m + " e impar e a soma de 1 ate " + m + " e: " + soma);
            }
        }
    }
}