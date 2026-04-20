package logica.exercicios61a80;

public class Exercicio78 {

    void main() {

        for (int i = 0; i < 5; i++) {

            int a = Integer.parseInt(IO.readln("\nInforme o valor de A: "));
            int b = Integer.parseInt(IO.readln("Informe o valor de B: "));

            if (a < b) {
                for (int j = a; j <= b; j++) {
                    if (j % 2 == 0) {
                        IO.println(j);
                    }
                }
            } else {
                IO.println("Valor de A deve ser menor que B");
            }
        }
    }
}