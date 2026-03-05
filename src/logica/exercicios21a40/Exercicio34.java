package logica.exercicios21a40;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio34 {

    void main() {

        // Exercício pede o uso de Switch Case

        String entrada = IO.readln("Informe o saldo médio: ");
        BigDecimal saldoMedio = new BigDecimal(entrada);

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        int faixa;

        if (saldoMedio.compareTo(new BigDecimal("0")) >= 0 &&
                saldoMedio.compareTo(new BigDecimal("200")) <= 0) {
            faixa = 0;
        } else if (saldoMedio.compareTo(new BigDecimal("201")) >= 0 &&
                saldoMedio.compareTo(new BigDecimal("400")) <= 0) {
            faixa = 1;
        } else if (saldoMedio.compareTo(new BigDecimal("401")) >= 0 &&
                saldoMedio.compareTo(new BigDecimal("600")) <= 0) {
            faixa = 2;
        } else {
            faixa = 3;
        }

        BigDecimal credito;
        switch (faixa) {
            case 0 -> credito = BigDecimal.ZERO;
            case 1 -> credito = saldoMedio.multiply(new BigDecimal("0.2"));
            case 2 -> credito = saldoMedio.multiply(new BigDecimal("0.3"));
            case 3 -> credito = saldoMedio.multiply(new BigDecimal("0.4"));
            default -> credito = BigDecimal.ZERO;
        }

        IO.println("Saldo médio: " + nf.format(saldoMedio));
        IO.println("Credito: " + nf.format(credito));

    }
}
