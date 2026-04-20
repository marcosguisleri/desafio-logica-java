package logica.exercicios61a80;

public class Exercicio70 {

    void main() {

        int idade;
        int maiorIdade = 0;
        int total = 0;
        String sexo;
        String corOlhos;
        String corCabelos;

        while (true) {
            idade = Integer.parseInt(IO.readln("\nInforme a idade (-1 para encerrar): "));

            if (idade == -1) {
                IO.println("\nEncerrando leitura de dados...");
                break;
            }

            while (idade < 0) {
                idade = Integer.parseInt(IO.readln("Informe uma idade válida: "));
            }

            sexo = IO.readln("Informe o sexo (masculino/M ou feminino/F): ");
            corOlhos = IO.readln("Informe a cor dos olhos (azuis, verdes ou castanhos): ");
            corCabelos = IO.readln("Informe a cor do cabelo (louros, castanhos, pretos): ");

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if ((sexo.equals("feminino") || sexo.equals("F"))
                    && idade >= 18
                    && idade <= 35
                    && corOlhos.equals("verdes")
                    && corCabelos.equals("louros")) {
                total++;
            }

        }

        IO.println("\nRESULTADOS:");
        IO.println("Maior idade do grupo: " + maiorIdade);
        IO.println("Quantidade cuja idade estiver entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelos louros: " + total);
    }
}
