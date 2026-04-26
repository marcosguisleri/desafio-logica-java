package logica.exercicios81a100;

public class Exercicio88 {

    void main() {

        int somaIdade = 0;
        int somaIdadeHomens = 0;
        int contMulheres = 0;
        int contHomens = 0;
        int cont18a35Anos = 0;
        double somaAlturaMulheres = 0.0;

        int i = 0;

        do {
            int sexo = Integer.parseInt(IO.readln("Informe o sexo (0 para feminino, 1 para masculino): "));

            while (sexo != 0 && sexo != 1) {
                sexo = Integer.parseInt(IO.readln("Informe um sexo válido (0 para feminino, 1 para masculino): "));
            }

            int idade = Integer.parseInt(IO.readln("Informe a idade: "));
            double altura = Double.parseDouble(IO.readln("Informe a altura: "));

            if (sexo == 0) {
                contMulheres++;
                somaAlturaMulheres += altura;
            } else {
                contHomens++;
                somaIdadeHomens += idade;
            }

            if (idade >= 18 && idade <= 35) {
                cont18a35Anos++;
            }

            somaIdade += idade;

            i++;

        } while (i < 1000);

        IO.println("\nResultados:");

        IO.println("Média de idade: " + (double) somaIdade / 1000);

        if (contMulheres > 0) {
            IO.println("Média de altura das mulheres: " + somaAlturaMulheres / contMulheres);
        } else {
            IO.println("Não houveram mulheres na amostra.");
        }

        if (contHomens > 0) {
            IO.println("Média de idade dos homens: " + (double) somaIdadeHomens / contHomens);
        } else {
            IO.println("Não houveram homens na amostra.");
        }

        IO.println("Percentual de idade entre 18 e 35 anos: "
                + (double) cont18a35Anos / 1000 * 100 + "%");
    }
}