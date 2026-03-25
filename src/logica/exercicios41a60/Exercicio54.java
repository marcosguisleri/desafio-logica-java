package logica.exercicios41a60;

public class Exercicio54 {

    void main() {

        double soma = 0;
        int cont = 0;

        while (true) {

            double valor = Double.parseDouble(IO.readln("Informe um valor: "));

            if (valor == 0) {
                IO.println("Calculando média dos valores pares...\n");
                break;
            }

            if (valor % 2 == 0) {
                soma += valor;
                cont++;
            }

        }

        if (cont == 0) {
            IO.println("Nenhum valor par foi informado.");
        } else {
            System.out.printf("A média dos valores pares é: %.2f%n", soma / cont);
        }

    }
}
