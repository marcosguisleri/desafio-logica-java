package logica.exercicios101a123;

public class Exercicio121 {

    public static int calcularMdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }

    public static boolean saoPrimosEntreSi(int a, int b) {
        return calcularMdc(a, b) == 1;
    }

    void main() {

        int quantidade = Integer.parseInt(IO.readln("Informe a quantidade de valores a serem lidos: "));

        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Informe um número inteiro positivo: "));
        }

        IO.println("\n=== PARES DE NÚMEROS PRIMOS ENTRE SI ===");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (saoPrimosEntreSi(numeros[i], numeros[j])) {
                    IO.println("(" + numeros[i] + ", " + numeros[j] + ")");
                }
            }
        }
    }
}