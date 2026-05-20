package logica.exercicios101a123;

public class Exercicio112 {

    void main() {

        int[] vetor = new int[500];
        int maiorElemento = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(IO.readln("Informe um valor: "));

            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
            }
        }

        if (maiorElemento == 0) {
            IO.println("Não é possível dividir por zero.");
            return;
        }

        IO.println("\nVetor dividido por " + maiorElemento + ":");

        for (int i = 0; i < vetor.length; i++) {
            double resultado = (double) vetor[i] / maiorElemento;
            IO.println(resultado);
        }
    }
}
