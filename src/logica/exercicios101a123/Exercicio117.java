package logica.exercicios101a123;

public class Exercicio117 {

    void main() {

        int N = Integer.parseInt(IO.readln("Digite o tamanho da matriz: "));
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Valor: "));
            }
        }

        boolean simetrica = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica) {
            IO.println("A matriz é SIMÉTRICA");
        } else {
            IO.println("A matriz NÃO é simétrica");
        }
    }
}