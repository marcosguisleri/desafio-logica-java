package logica.exercicios101a123;

public class Exercicio118 {

    void main(String[] args) {

        int peso;
        double altura;
        String sexo;

        int numeroMulheresAcima170 = 0;
        int homensAcimaPeso = 0;
        int mulheresAnorexicas = 0;
        int homensBaixos = 0;

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 100; i++) {

            peso = Integer.parseInt(IO.readln("Informe seu peso (kg): "));
            altura = Double.parseDouble(IO.readln("Informe sua altura (m): "));
            sexo = IO.readln("Informe seu sexo (M/F): ");

            double imc = peso / (altura * altura);

            if (sexo.equalsIgnoreCase("F")) {
                totalMulheres++;

                if (altura > 1.70) {
                    numeroMulheresAcima170++;
                }

                if (imc < 16) {
                    mulheresAnorexicas++;
                }
            }

            if (sexo.equalsIgnoreCase("M")) {
                totalHomens++;

                if (imc > 25) {
                    homensAcimaPeso++;
                }

                if (altura < 1.60) {
                    homensBaixos++;
                }
            }
        }

        double percHomensAcimaPeso = (totalHomens > 0) ? (homensAcimaPeso * 100.0 / totalHomens) : 0;
        double percMulheresAnorexicas = (totalMulheres > 0) ? (mulheresAnorexicas * 100.0 / totalMulheres) : 0;

        IO.println("\nRESULTADOS:");
        IO.println("a) Mulheres acima de 1,70m: " + numeroMulheresAcima170);
        IO.println("b) % de homens acima do peso: " + percHomensAcimaPeso + "%");
        IO.println("c) % de mulheres anoréxicas: " + percMulheresAnorexicas + "%");
        IO.println("d) Homens baixos: " + homensBaixos);
    }
}