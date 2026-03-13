package logica.exercicios41a60;

public class Exercicio42 {

    void main() {

        double reais = Double.parseDouble(IO.readln("Informe o valor em reais: R$ "));

        int notas100 = (int) (reais / 100);
        int sobra100 = (int) (reais % 100);
        int notas50 = (sobra100 / 50);
        int sobra50 = (sobra100 % 50);
        int notas10 = (sobra50 / 10);
        int sobra10 = (sobra50 % 10);
        int notas5 = (sobra10 / 5);
        int sobra5 = (sobra10 % 5);
        int notas1 = (sobra5 / 1);

        IO.println("Notas de R$ 100, R$ 50, R$ 10, R$ 5 e R$ 1: ");
        IO.println(notas100 + " nota(s) de R$ 100, " + notas50 + " nota(s) de R$ 50, " + notas10 + " nota(s) de R$ 10, " + notas5 + " nota(s) de R$ 5 e " + notas1 + " nota(s) de R$ 1");

    }

}
