package logica.exercicios1a20;

public class Exercicio11 {

    void main() {

        double pontox1 = Double.parseDouble(IO.readln("Informe o X do primeiro ponto: "));
        double pontoz1 = Double.parseDouble(IO.readln("Informe o Y do primeiro ponto: "));

        double pontox2 = Double.parseDouble(IO.readln("Informe o X do segundo ponto: "));
        double pontoy2 = Double.parseDouble(IO.readln("Informe o Y do segundo ponto: "));

        double distanciaEntreDoisPontos = Math.sqrt(((pontox2 - pontox1) * (pontox2 - pontox1)) + ((pontoy2 - pontoz1) * (pontoy2 - pontoz1)));

        IO.println("A distância entre os pontos é de " + distanciaEntreDoisPontos);

    }

}
