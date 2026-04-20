package logica.exercicios61a80;

public class Exercicio80 {

    void main() {

        int x = Integer.parseInt(IO.readln("Informe a quantidade de valores a serem lidos: "));

        for (int i = 0; i < x; i++) {

            int n = Integer.parseInt(IO.readln("Informe um valor: "));

            int fatorial = 1;

            if (n < 0) {
                IO.println("Não existe fatorial de número negativo");
            } else {

                for (int j = 1; j <= n; j++) {
                    fatorial *= j;
                }

                IO.println(n + "! = " + fatorial);
            }
        }
    }
}