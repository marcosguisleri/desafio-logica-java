package logica.exercicios81a100;

public class Exercicio92 {

    void main() {

        int N = Integer.parseInt(IO.readln("Informe o valor de N: "));
        int p = Integer.parseInt(IO.readln("Informe o valor de p: "));

        if (N < 0 || p < 0 || p > N) {
            IO.println("Valores inválidos. Deve ser: N >= 0 e 0 <= p <= N");
            return;
        }

        long fatorialN = 1;
        long fatorialP = 1;
        long fatorialNmenosP = 1;

        for (int i = 1; i <= N; i++) {
            fatorialN *= i;
        }

        for (int i = 1; i <= p; i++) {
            fatorialP *= i;
        }

        for (int i = 1; i <= (N - p); i++) {
            fatorialNmenosP *= i;
        }

        long arranjo = fatorialN / fatorialNmenosP;
        long combinacao = fatorialN / (fatorialP * fatorialNmenosP);

        IO.println("--------------------");
        IO.println("Arranjo A(" + N + "," + p + ") = " + arranjo);
        IO.println("Combinação C(" + N + "," + p + ") = " + combinacao);
    }
}