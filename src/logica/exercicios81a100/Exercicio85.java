package logica.exercicios81a100;

public class Exercicio85 {

    void main() {

        int x = Integer.parseInt(IO.readln("Informe um valor inteiro e positivo: "));

        while (x <= 0) {
            x = Integer.parseInt(IO.readln("Informe um valor inteiro e positivo: "));
        }

        IO.println("Soma = " + (x * 10));

    }

}
