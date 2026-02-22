package logica.exercicios21a40;

public class Exercicio25 {

    void main() {

        int segundosTotal = Integer.parseInt(IO.readln("Informe o total de segundos: "));

        int horas = segundosTotal / 3600;
        int minutos = (segundosTotal % 3600) / 60;
        int segundosRestantes = segundosTotal % 60;

        IO.println("Horas: " + horas + " | Minutos: " + minutos + " | Segundos: " + segundosRestantes);

    }

}
