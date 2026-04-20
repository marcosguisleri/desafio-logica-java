package logica.exercicios61a80;

public class Exercicio65 {

    void main() {

        int quantP = 0;
        int quantI = 0;
        int somaPares = 0;
        int somaGeral = 0;

        while (true) {
            int x = Integer.parseInt(IO.readln("Informe um valor (0 para sair): "));

            if (x == 0) {
                IO.println("Programa encerrado.");
                break;
            }

            while (x < 0) {
                x = Integer.parseInt(IO.readln("Informe um valor positivo: "));
            }

            if (x % 2 == 0) {
                quantP++;
                somaPares += x;
            } else {
                quantI++;
            }

            somaGeral += x;
        }

        IO.println("\nResultado:");

        if (quantP + quantI == 0) {
            IO.println("Quantidade de números pares lidos: 0");
            IO.println("Quantidade de números ímpares lidos: 0");
            IO.println("Média dos números pares lidos: 0");
            IO.println("Média geral dos números lidos: 0");
        } else {
            IO.println("Quantidade de números pares lidos: " + quantP);
            IO.println("Quantidade de números ímpares lidos: " + quantI);

            if (quantP > 0) {
                double mediaPares = (double) somaPares / quantP;
                IO.println("Média dos números pares lidos: " + mediaPares);
            } else {
                IO.println("Média dos números pares lidos: 0");
            }

            double mediaGeral = (double) somaGeral / (quantP + quantI);
            IO.println("Média geral dos números lidos: " + mediaGeral);
        }
    }
}