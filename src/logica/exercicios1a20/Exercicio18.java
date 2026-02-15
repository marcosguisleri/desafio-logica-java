package logica.exercicios1a20;

public class Exercicio18 {

    void main() {

        int a = Integer.parseInt(IO.readln("Informe um valor: "));
        int b = Integer.parseInt(IO.readln("Informe outro valor: "));

        int maior = Math.max(a, b);
        int menor = Math.min(a, b);

        IO.println(menor + " " + maior);

    }

}
