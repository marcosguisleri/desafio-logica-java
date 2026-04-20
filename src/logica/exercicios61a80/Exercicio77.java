package logica.exercicios61a80;

public class Exercicio77 {

    void main() {

        int dentro = 0;

        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(IO.readln("Informe um valor: "));

            if (x >= 10 && x <= 20) {
                dentro++;
            }
        }

        int fora = 10 - dentro;

        IO.println("Valores dentro do intervalo [10-20]: " + dentro);
        IO.println("Valores fora do intervalo [10-20]: " + fora);

    }
}
