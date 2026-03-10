package logica.exercicios21a40;

public class Exercicio40 {

    void main() {

        int horaInicial = Integer.parseInt(IO.readln("Informe a hora inicial: "));
        int horaFinal = Integer.parseInt(IO.readln("Informe a hora final: "));

        if (horaInicial == horaFinal) {
            IO.println("Duração total: 24 horas");
        } else if (horaInicial > horaFinal) {
            IO.println("Duração total: " + ((24 - horaInicial) + horaFinal) + " hora(s)");
        } else {
            IO.println("Duração total: " + (horaFinal - horaInicial) + " hora(s)");
        }

    }

}
