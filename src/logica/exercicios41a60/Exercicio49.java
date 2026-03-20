package logica.exercicios41a60;

public class Exercicio49 {

    void main() {
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        int quantidadeAnos = 0;

        while (alturaChico > alturaZe) {
            alturaChico += 0.02;
            alturaZe += 0.03;
            quantidadeAnos++;
        }

        IO.println("Quantidade de anos: " + quantidadeAnos);
    }
}
