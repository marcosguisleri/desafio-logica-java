package logica.exercicios101a123;

public class Exercicio122 {

    public static void lerVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(IO.readln("Informe o " + (i + 1) + "º valor: "));
        }
    }

    public static void escreverVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            IO.println("Vetor[" + i + "] = " + vetor[i]);
        }
    }

    public static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    int auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
    }

    void main() {

        int quantidade = Integer.parseInt(IO.readln("Informe a quantidade de elementos do vetor: "));

        int[] vetor = new int[quantidade];

        IO.println("\n=== LEITURA DO VETOR ===");
        lerVetor(vetor);

        IO.println("\n=== VETOR ORIGINAL ===");
        escreverVetor(vetor);

        ordenarVetor(vetor);

        IO.println("\n=== VETOR ORDENADO CRESCENTEMENTE ===");
        escreverVetor(vetor);
    }
}