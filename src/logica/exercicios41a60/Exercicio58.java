package logica.exercicios41a60;

public class Exercicio58 {

    void main() {

        for (int i = 1; i <= 20; i++) {
            int n = Integer.parseInt(IO.readln("\nInforme um valor: \n"));

            for (int j = 1; j <= n; j++) {
                IO.println(n + " x " + j + " = " + (n * j));
            }
        }

    }
}
