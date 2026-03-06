package logica.exercicios1a20;

public class Exercicio35 {

    void main() {

        double x1 = Integer.parseInt(IO.readln("Informe o primeiro valor: "));
        double x2 = Integer.parseInt(IO.readln("Informe o segundo valor: "));
        double x3 = Integer.parseInt(IO.readln("Informe o terceiro valor: "));

        IO.println("====================================");
        IO.println("  Escolha o tipo de média desejada:  ");
        IO.println("====================================");
        IO.println("1. Média Aritmética");
        IO.println("2. Média Ponderada (3, 3, 4)");
        IO.println("3. Média Harmônica");
        IO.println("====================================");
        int escolha = Integer.parseInt(IO.readln("Digite o número da opção desejada: "));

        double media = 0;

        if (escolha == 1) {
            media = (x1 + x2 + x3) / 3;
            IO.println("A média aritmética dos três valores é: " + media);
        } else if (escolha == 2) {
            media = ((x1 * 3) + (x2 * 3) + (x3 * 4)) / 10;
            IO.println("A média ponderada (3, 3, 4) dos três valores é: " + media);
        } else if (escolha == 3) {
            double somaInversos = (1 / x1) + (1 / x2) + (1 / x3);
            media = 3 / somaInversos;
            IO.println("A média harmônica dos três valores é: " + media);
        } else {
            IO.println("Opção inválida! Tente novamente.");
        }

    }

}
