package logica.exercicios61a80;

public class Exercicio67 {

    void main() {

        int produtoPares = 1;
        boolean encontrouPar = false;

        while (true) {
            int x = Integer.parseInt(IO.readln("Informe um valor inteiro e positivo (digite 0 para sair): "));

            if (x == 0) {
                IO.println("\nCalculando resultado: ");
                break;
            }

            while (x < 0) {
                x = Integer.parseInt(IO.readln("Informe um valor inteiro e positivo (digite 0 para sair): "));
            }

            if (x % 2 == 0) {
                produtoPares *= x;
                encontrouPar = true;
            }

        }

        IO.println("--------------------------------------");


        if (!encontrouPar) {
            IO.println("Nenhum número par foi informado.");
        } else {
            IO.println("Produto dos números pares lidos: " + produtoPares);
        }

    }
}
