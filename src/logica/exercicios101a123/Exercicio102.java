package logica.exercicios101a123;

public class Exercicio102 {

    void main() {

        int[] vetorBase = new int[7];

        int menorElemento = Integer.MAX_VALUE;
        int posicaoMenorElemento = 0;

        for (int i = 0; i < vetorBase.length; i++) {
            vetorBase[i] = Integer.parseInt(IO.readln("Informe um valor: "));

            if (vetorBase[i] < menorElemento) {
                menorElemento = vetorBase[i];
                posicaoMenorElemento = i;
            }
        }


        IO.println("===============");
        IO.println("Menor elemento: " + menorElemento);
        IO.println("Posição: " + posicaoMenorElemento);

    }
}
