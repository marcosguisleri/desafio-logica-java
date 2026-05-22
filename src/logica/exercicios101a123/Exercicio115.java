package logica.exercicios101a123;

public class Exercicio115 {

    void main() {

        int[] vetorClientes = new int[50];
        int[] vetorLocacoes = new int[50];

        for (int i = 0; i < vetorClientes.length; i++) {
            vetorClientes[i] = Integer.parseInt(IO.readln("Informe a quantidade de locações do cliente: "));
            vetorLocacoes[i] = vetorClientes[i] / 10;
        }

        IO.println("\nQuantidade de locações gratuitas por cliente: \n");
        for (int locacoes : vetorLocacoes) {
            IO.println(locacoes);
        }

    }

}
