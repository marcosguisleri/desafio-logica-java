package logica.exercicios41a60;

public class Exercicio55 {

    void main() {

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 50; i++) {
            int valor = Integer.parseInt(IO.readln("Digite o " + i + "º valor: "));

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        IO.println("\nMaior valor: " + maior);
        IO.println("Menor valor: " + menor);

    }
}
