package logica.exercicios81a100;

public class Exercicio100 {

    void main() {

        int[] vetorGabarito = new int[13];
        int[] vetorApostador1 = new int[13];
        int[] vetorApostador2 = new int[13];
        int[] vetorApostador3 = new int[13];

        int quantAcertosApostador1 = 0;
        int quantAcertosApostador2 = 0;
        int quantAcertosApostador3 = 0;

        for (int i = 0; i < vetorGabarito.length; i++) {
            vetorGabarito[i] = Integer.parseInt(IO.readln("Informe o valor do gabarito da posição " + (i + 1) + ": "));
        }

        int numeroCartaoApostador1 = Integer.parseInt(IO.readln("Informe o número do cartão do apostador 1: "));

        for (int i = 0; i < vetorApostador1.length; i++) {
            vetorApostador1[i] = Integer.parseInt(IO.readln("Informe a resposta " + (i + 1) + " do apostador 1: "));
        }

        int numeroCartaoApostador2 = Integer.parseInt(IO.readln("Informe o número do cartão do apostador 2: "));

        for (int i = 0; i < vetorApostador2.length; i++) {
            vetorApostador2[i] = Integer.parseInt(IO.readln("Informe a resposta " + (i + 1) + " do apostador 2: "));
        }

        int numeroCartaoApostador3 = Integer.parseInt(IO.readln("Informe o número do cartão do apostador 3: "));

        for (int i = 0; i < vetorApostador3.length; i++) {
            vetorApostador3[i] = Integer.parseInt(IO.readln("Informe a resposta " + (i + 1) + " do apostador 3: "));
        }

        for (int i = 0; i < vetorGabarito.length; i++) {
            if (vetorGabarito[i] == vetorApostador1[i]) {
                quantAcertosApostador1++;
            }

            if (vetorGabarito[i] == vetorApostador2[i]) {
                quantAcertosApostador2++;
            }

            if (vetorGabarito[i] == vetorApostador3[i]) {
                quantAcertosApostador3++;
            }
        }

        IO.println("Cartão do apostador 1: " + numeroCartaoApostador1);
        IO.println("Quantidade de acertos: " + quantAcertosApostador1);

        if (quantAcertosApostador1 == 13) {
            IO.println("Ganhador");
        }

        IO.println("------------------------------");

        IO.println("Cartão do apostador 2: " + numeroCartaoApostador2);
        IO.println("Quantidade de acertos: " + quantAcertosApostador2);

        if (quantAcertosApostador2 == 13) {
            IO.println("Ganhador");
        }

        IO.println("------------------------------");

        IO.println("Cartão do apostador 3: " + numeroCartaoApostador3);
        IO.println("Quantidade de acertos: " + quantAcertosApostador3);

        if (quantAcertosApostador3 == 13) {
            IO.println("Ganhador");
        }
    }
}