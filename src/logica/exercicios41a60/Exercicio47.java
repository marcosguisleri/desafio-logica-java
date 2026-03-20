package logica.exercicios41a60;

public class Exercicio47 {

    void main() {

        int cont = 0;

        for (int i = 1; i <= 5; i++) {
            int x = Integer.parseInt(IO.readln("Informe um valor: "));
            if (x < 0) {
                cont++;
            }
        }

        IO.println("Quantidade de valores negativos: " + cont);

    }
}
