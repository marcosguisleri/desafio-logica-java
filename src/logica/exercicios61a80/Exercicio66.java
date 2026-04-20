package logica.exercicios61a80;

public class Exercicio66 {

    void main() {

        int somaNegativos = 0;

        while (true) {
            int x = Integer.parseInt(IO.readln("Informe um valor inteiro (digite 0 para encerrar): "));

            if (x == 0) {
                IO.println("\nCalculando Resultado...");
                break;
            }

            if (x < 0) {
                somaNegativos += x;
            }

        }

        IO.println("--------------------------------------");

        if (somaNegativos == 0) {
            IO.println("Nenhum número negativo foi informado.");
        } else {
            IO.println("Soma dos números negativos lidos: " + somaNegativos);
        }


    }
}
