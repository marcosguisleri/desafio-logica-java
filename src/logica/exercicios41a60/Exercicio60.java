package logica.exercicios41a60;

public class Exercicio60 {

    void main() {

        int quantPositivos = 0;
        int quantNegativos = 0;
        double media = 0;

        int x = Integer.parseInt(IO.readln("Informe a quantidade de leituras que serão feitas: "));

        for (int i = 1; i <= x; i++) {

            double y = Integer.parseInt(IO.readln("\nInforme um valor: "));

            if (y == 0) {
                continue;
            } else if (y < 0) {
                quantNegativos++;
            } else {
                quantPositivos++;
            }

            media += y;

        }

        IO.println("\nMédia dos valores: " + media / x);
        IO.println("Quantidade de valores positivos: " + quantPositivos);
        IO.println("Quantidade de valores negativos: " + quantNegativos);
        IO.println("Percentual de números positivos: " + ((quantPositivos * 100) / x) + "%");
        IO.println("Percentual de números negativos: " + ((quantNegativos * 100) / x) + "%");

    }
}
