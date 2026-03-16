package logica.exercicios41a60;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Exercicio44 {

    void main() {

        Scanner input = new Scanner(System.in);

        LocalTime inicio = LocalTime.of(0, 0);
        LocalTime fim = LocalTime.of(0, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        while (true) {
            IO.print("Digite a hora de início (HH:mm): ");
            try {
                inicio = LocalTime.parse(input.next(), formatter);
                break;
            } catch (DateTimeParseException ex) {
                IO.println("Erro: Digite a hora no formato HH:mm (ex: 08:30)");
            }
        }

        while (true) {
            IO.print("Digite a hora de fim (HH:mm): ");
            try {
                fim = LocalTime.parse(input.next(), formatter);
                break;
            } catch (DateTimeParseException ex) {
                IO.println("Erro: Digite a hora no formato HH:mm (ex: 08:30)");
            }
        }

        Duration diferenca = Duration.between(inicio, fim);

        if (diferenca.isNegative()) {
            diferenca = diferenca.plusDays(1);
        }

       IO.println("Duração: " + diferenca.toHours() + "h " + diferenca.toMinutesPart() + "min");

    }

}
