package logica.exercicios81a100;

public class Exercicio91 {

    public static void main(String[] args) {
        int x = Integer.parseInt(IO.readln("Informe o valor de x: "));
        int y = Integer.parseInt(IO.readln("Informe o valor de y: "));

        int potencia = (int) Math.pow(x, y);
        IO.println("Valor potência: " + potencia);
    }
}
