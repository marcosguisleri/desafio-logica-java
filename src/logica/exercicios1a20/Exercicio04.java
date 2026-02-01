package logica.exercicios1a20;

public class Exercicio04 {

    void main() {

        int a = Integer.parseInt(IO.readln("Informe um valor A: "));
        int b = Integer.parseInt(IO.readln("Informe outro valor B: "));

        int c = a;
        a = b;
        b = c;

        IO.println("A = " + a);
        IO.println("B = " + b);

    }

}
