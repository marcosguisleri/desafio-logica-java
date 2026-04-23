package logica.exercicios81a100;

public class Exercicio87 {

    void main() {

        int somaVeiculos = 0;
        int somaRS = 0;
        int contRS = 0;

        int codigoMaxCidade = 0;
        int codigoMinCidade = 0;

        int maiorIndice = 0;
        int menorIndice = Integer.MAX_VALUE;

        for (int i = 0; i < 200; i++) {

            int codigoCidade = Integer.parseInt(IO.readln("Informe o código da cidade: "));
            String estado = IO.readln("Informe o estado: ");
            int numeroVeiculos = Integer.parseInt(IO.readln("Informe o número de veículos de passeio em 1992: "));
            int numeroAcidentes = Integer.parseInt(IO.readln("Informe o número de acidentes com vítimas em 1992: "));

            if (numeroAcidentes > maiorIndice) {
                maiorIndice = numeroAcidentes;
                codigoMaxCidade = codigoCidade;
            }

            if (numeroAcidentes < menorIndice) {
                menorIndice = numeroAcidentes;
                codigoMinCidade = codigoCidade;
            }

            if (estado.equals("RS")) {
                somaRS += numeroAcidentes;
                contRS++;
            }

            somaVeiculos += numeroVeiculos;
        }

        double mediaVeiculos = (double) somaVeiculos / 200;

        IO.println("\n---------------");
        IO.println("RESULTADOS");
        IO.println("Maior índice de acidentes: " + maiorIndice + " (cidade código " + codigoMaxCidade + ")");
        IO.println("Menor índice de acidentes: " + menorIndice + " (cidade código " + codigoMinCidade + ")");
        IO.println("Média de veículos nas cidades brasileiras: " + mediaVeiculos);

        if (contRS > 0) {
            double mediaRS = (double) somaRS / contRS;
            IO.println("Média de acidentes com vítimas no RS: " + mediaRS);
        } else {
            IO.println("Não há cidades do RS na amostra.");
        }
    }
}