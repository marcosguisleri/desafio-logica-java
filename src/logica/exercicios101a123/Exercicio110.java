package logica.exercicios101a123;

public class Exercicio110 {

    void main() {

        int codigo;
        double[] vetor = new double[50];

        codigo = Integer.parseInt(IO.readln(
                "Informe o código: 0-Encerrar | 1-Ordem Direta | 2-Ordem Inversa: "
        ));

        if (codigo == 0) {
            IO.println("Encerrando o programa...");
            return;
        }

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Double.parseDouble(IO.readln("Informe um valor: "));
        }

        switch (codigo) {
            case 1: {
                IO.println("\nVetor na ordem direta:");

                for (int i = 0; i < vetor.length; i++) {
                    IO.println(vetor[i]);
                }

                break;
            }

            case 2: {
                IO.println("\nVetor na ordem inversa:");

                for (int i = vetor.length - 1; i >= 0; i--) {
                    IO.println(vetor[i]);
                }

                break;
            }

            default: {
                IO.println("Número inválido.");
                break;
            }
        }
    }
}
