package logica.exercicios41a60;

public class Exercicio57 {

    void main() {

        int n = Integer.parseInt(IO.readln("Informe o número de termos: "));
        double a1 = Double.parseDouble(IO.readln("Informe o valor do primeiro termo: "));
        double r = Double.parseDouble(IO.readln("Informe a razão: "));

        IO.println("Progressão aritmética:");
        for (int i = 0; i < n; i++) {
            double termo = a1 + i * r;
            IO.print(termo + " ");
        }
        IO.println();

        double an = a1 + (n - 1) * r;

        double soma = (n * (a1 + an)) / 2;

        IO.println("Soma dos " + n + " termos = " + soma);

    }
}
