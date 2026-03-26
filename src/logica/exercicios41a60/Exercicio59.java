package logica.exercicios41a60;

public class Exercicio59 {

    void main() {

        int n = Integer.parseInt(IO.readln("Informe a quantidade de leituras: "));

        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(IO.readln("Informe um valor: "));
            int fatorial = 1;

            for (int j = 1; j <= x; j++) {
                fatorial *= j;
            }

            IO.println("Valor lido: " + x);
            IO.println("Fatorial = " + fatorial);
        }

    }
}
