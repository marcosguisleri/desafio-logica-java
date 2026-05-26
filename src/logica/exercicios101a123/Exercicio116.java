package logica.exercicios101a123;

public class Exercicio116 {

   void main() {

        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizA[i][j] = Integer.parseInt(IO.readln("Informe um valor: "));
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }

        IO.println("\nMatriz Transposta:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                IO.print(matrizB[i][j] + " ");
            }
            IO.println("");
        }
    }
}