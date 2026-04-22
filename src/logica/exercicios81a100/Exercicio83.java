package logica.exercicios81a100;

public class Exercicio83 {

    void main() {

        int x = Integer.parseInt(
                IO.readln("Informe o número de valores a serem lidos: ")
        );

        IO.println("Valor\tSoma(1..m)\tFatorial");

        for (int i = 0; i < x; i++) {

            int m = Integer.parseInt(
                    IO.readln("\nInforme um valor inteiro e positivo: ")
            );

            while (m < 0) {
                m = Integer.parseInt(IO.readln("Informe um valor válido: "));
            }

            int soma = 0;
            for (int j = 1; j <= m; j++) {
                soma += j;
            }

            int fatorial = 1;
            for (int j = 1; j <= m; j++) {
                fatorial *= j;
            }

            IO.println(m + "\t" + soma + "\t\t" + fatorial);
        }
    }
}
