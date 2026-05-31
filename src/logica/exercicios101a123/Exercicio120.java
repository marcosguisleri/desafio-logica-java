package logica.exercicios101a123;

public class Exercicio120 {

    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    void main() {

        int quantidade = Integer.parseInt(IO.readln("Informe a quantidade de valores a serem lidos: "));

        String primos = "";
        String naoPrimos = "";

        for (int i = 0; i < quantidade; i++) {
            int numero = Integer.parseInt(IO.readln("Informe um valor inteiro positivo: "));

            if (ehPrimo(numero)) {
                primos += numero + "\n";
            } else {
                naoPrimos += numero + "\n";
            }
        }

        IO.println("\n=== NÚMEROS PRIMOS ===");
        IO.println(primos);

        IO.println("=== NÚMEROS NÃO PRIMOS ===");
        IO.println(naoPrimos);
    }
}