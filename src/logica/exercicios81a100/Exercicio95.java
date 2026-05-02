package logica.exercicios81a100;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercicio95 {

    void main() {

        String dataString = IO.readln("Informe a primeira data (yyyy-MM-dd): ");
        LocalDate data1 = LocalDate.parse(dataString);

        String dataString2 = IO.readln("Informe a segunda data (yyyy-MM-dd): ");
        LocalDate data2 = LocalDate.parse(dataString2);

        long dias = ChronoUnit.DAYS.between(data1,data2);

        System.out.println("Dias entre as datas: " + dias);
    }

}
