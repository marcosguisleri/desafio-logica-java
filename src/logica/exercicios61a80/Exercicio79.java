package logica.exercicios61a80;

public class Exercicio79 {

    void main() {

        double maiorAltura = 0.0;
        double menorAltura = Double.MAX_VALUE;
        double somaMulheres = 0.0;
        double somaGeral = 0.0;

        int sexo;
        int quantMulheres = 0;

        for (int i = 0; i < 50; i++) {

            double altura = Double.parseDouble(
                    IO.readln("Informe a altura em metros: ")
            );

            sexo = Integer.parseInt(
                    IO.readln("Informe o sexo (1=masculino, 2=feminino): ")
            );

            while (sexo != 1 && sexo != 2) {
                sexo = Integer.parseInt(
                        IO.readln("Código inválido! Informe 1 ou 2: ")
                );
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 2) {
                somaMulheres += altura;
                quantMulheres++;
            }

            somaGeral += altura;
        }

        IO.println("\nRESULTADOS:");
        IO.println("Maior altura: " + maiorAltura);
        IO.println("Menor altura: " + menorAltura);

        if (quantMulheres > 0) {
            IO.println("Média da altura das mulheres: " + (somaMulheres / quantMulheres));
        } else {
            IO.println("Não houve mulheres na amostra.");
        }

        IO.println("Média da altura da turma: " + (somaGeral / 50));
    }
}