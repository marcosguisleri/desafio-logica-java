package logica.exercicios101a123;

public class Exercicio105 {

    void main() {

        char[] vetorG = new char[10];
        char[] vetorR = new char[10];

        for (int i = 0; i < vetorG.length; i++) {
            char g = IO.readln("Informe a resposta " + (i + 1) + " do gabarito: ")
                    .toUpperCase()
                    .charAt(0);

            vetorG[i] = g;
        }

        for (int j = 0; j < 20; j++) {

            int numeroAcertos = 0;

            IO.println("\nAluno " + (j + 1));

            for (int k = 0; k < vetorR.length; k++) {
                char r = IO.readln("Informe a resposta " + (k + 1) + " do aluno: ")
                        .toUpperCase()
                        .charAt(0);

                vetorR[k] = r;

                if (vetorG[k] == vetorR[k]) {
                    numeroAcertos++;
                }
            }

            IO.println("Número de acertos: " + numeroAcertos);

            if (numeroAcertos >= 6) {
                IO.println("APROVADO!");
            } else {
                IO.println("REPROVADO!");
            }
        }
    }
}