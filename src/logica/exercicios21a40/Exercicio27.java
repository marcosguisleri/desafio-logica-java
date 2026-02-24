package logica.exercicios21a40;

public class Exercicio27 {

    void main() {

        int a = Integer.parseInt(IO.readln("Informe o primeiro valor: "));
        int b = Integer.parseInt(IO.readln("Informe o segundo valor: "));
        int c = Integer.parseInt(IO.readln("Informe o terceiro valor: "));

        IO.println(a + " " + b + " " + c);

        IO.println("O maior valor é " + Math.max(a, Math.max(b, c)));

    }

}
