package logica.exercicios81a100;

public class Exercicio94 {

    void main() {

        int num1 = Integer.parseInt(IO.readln("Informe o primeiro valor: "));
        int num2 = Integer.parseInt(IO.readln("Informe o segundo valor: "));

        if (num1 == num2) {
            IO.println("Erro: os extremos não podem ser iguais.");
        } else {

            int menor = Math.min(num1, num2);
            int maior = Math.max(num1, num2);

            double intervalo = (maior - menor) / 3.0;

            IO.println("Dividindo o intervalo [" + menor + ", " + maior + "] em 3 partes iguais:");
            IO.println("Ponto 1: " + menor);
            IO.println("Ponto 2: " + (menor + intervalo));
            IO.println("Ponto 3: " + (menor + 2 * intervalo));
            IO.println("Ponto 4: " + maior);
        }

    }

}
