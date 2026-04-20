package logica.exercicios81a100;

public class Exercicio82 {

    void main() {

        int quantidade = 0;
        int num = 2;

        while (quantidade < 5) {

            int somaDivisores = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == num) {
                IO.println("Número perfeito: " + num);
                quantidade++;
            }

            num++;
        }
    }
}