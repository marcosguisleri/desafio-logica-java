package logica.exercicios21a40;

public class Exercicio39 {

    void main() {

        int a = Integer.parseInt(IO.readln("Informe o primeiro valor: "));
        int b = Integer.parseInt(IO.readln("Informe o segundo valor: "));
        int c = Integer.parseInt(IO.readln("Informe o terceiro valor: "));

        int maior = Math.max(a, Math.max(b, c));
        int somaOutros = (a + b + c) - maior;

        if (maior >= somaOutros) {
            IO.println("Não forma triângulo!");
            IO.println("Valores Lidos: " + a + ", " + b + ", " + c);
        } else {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            IO.println("A area do triângulo é: " + area);
        }

    }

}
