package logica.exercicios81a100;

public class Exercicio98 {

     void main() {

        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];

        int quantPares = 0;
        int quantImpar = 0;

        for (int i = 0; i < 30; i++) {
            int valor = Integer.parseInt(IO.readln("Informe um valor: "));

            if (valor % 2 == 0) {
                if (quantPares < 10) {
                    vetorPar[quantPares] = valor;
                    quantPares++;
                } else {
                    IO.println("Vetor de pares cheio!");
                    imprimirVetor(vetorPar, "Par");
                    quantPares = 0;
                }
            } else {
                if (quantImpar < 10) {
                    vetorImpar[quantImpar] = valor;
                    quantImpar++;
                } else {
                    IO.println("Vetor de ímpares cheio!");
                    imprimirVetor(vetorImpar, "Ímpar");
                    quantImpar = 0;
                }
            }
        }

        IO.println("\nConteúdo final do vetor de pares:");
        imprimirVetor(vetorPar, "Par");

        IO.println("\nConteúdo final do vetor de ímpares:");
        imprimirVetor(vetorImpar, "Ímpar");
    }

    static void imprimirVetor(int[] vetor, String nome) {
        for (int i = 0; i < vetor.length; i++) {
            IO.println(nome + " [" + i + "] = " + vetor[i]);
        }
    }
}