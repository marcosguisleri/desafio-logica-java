package logica.exercicios81a100;

import java.math.BigDecimal;

public class Exercicio89 {

    void main() {

        for (int i = 1; i <= 150; i++) {

            String nomeCliente = IO.readln("Informe o nome do cliente: ");
            BigDecimal valorCompras = new BigDecimal(IO.readln("Informe o valor das compras: "));

            BigDecimal bonus;

            if (valorCompras.compareTo(BigDecimal.valueOf(500000)) < 0) {
                bonus = valorCompras.multiply(BigDecimal.valueOf(0.10));
            } else {
                bonus = valorCompras.multiply(BigDecimal.valueOf(0.15));
            }

            IO.println("Cliente: " + nomeCliente);
            IO.println("Bônus: " + bonus);
        }

    }

}
