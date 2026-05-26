package logica.exercicios101a123;

public class Exercicio119 {

    void main() {
        int base = Integer.parseInt(IO.readln("Informe a base: "));
        int expoente = Integer.parseInt(IO.readln("Informe o expoente: "));

        int resultado = POW(base, expoente);

        IO.println("Resultado: " + resultado);
    }

    public static int POW(int base, int expoente) {

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }


}
