package logica.exercicios1a20;

public class Exercicio03 {

    void main() {

        int numero1 = Integer.parseInt(IO.readln("Informe um valor: "));
        int numero2 = Integer.parseInt(IO.readln("Informe outro valor: "));

        IO.println("Soma = " + (numero1 + numero2));
        IO.println("Subtração = " + (numero1 - numero2));
        IO.println("Multiplicação = " + (numero1 * numero2));
        IO.println("Divisão = " + (numero1 / numero2));

    }

}
