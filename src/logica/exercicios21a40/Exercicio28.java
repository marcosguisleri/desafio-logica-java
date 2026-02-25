package logica.exercicios21a40;

public class Exercicio28 {

    void main() {

        int a, b;

        a = Integer.parseInt(IO.readln("Informe o primeiro valor: "));
        b = Integer.parseInt(IO.readln("Informe o segundo valor: "));

        if (b == 0) {
            IO.println("Não é possível verificar múltiplos (divisão por zero).");
        } else if (a % b == 0 || b % a == 0) {
            IO.println("São múltiplos");
        } else {
            IO.println("Não são múltiplos");
        }

    }

}
