package logica.exercicios81a100;

public class Exercicio96 {

    void main() {

        int[] vetorInteiros = new int[20];
        int contPares = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            vetorInteiros[i] = Integer.parseInt(IO.readln("Informe um valor: "));

            if (vetorInteiros[i] % 2 == 0) {
                contPares++;
            }
        }

        IO.println("Quantidade de números inteiros pares lidos: " + contPares);

    }

}
