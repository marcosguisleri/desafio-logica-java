package logica.exercicios61a80;

public class Exercicio81 {

    void main() {

        long produto = 1;
        boolean primo;

        for (int i = 92; i <= 1478; i++) {

            primo = true;

            if (i < 2) {
                primo = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                produto *= i;
            }
        }

        IO.println("Produto dos números primos entre 92 e 1478: " + produto);
    }
}