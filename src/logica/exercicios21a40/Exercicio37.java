package logica.exercicios21a40;

import java.util.HashMap;
import java.util.Map;

public class Exercicio37 {

    void main() {

        Map<String, Double> mapa = new HashMap<>();
        mapa.put("ABCD", 5.30);
        mapa.put("XYPK", 6.00);
        mapa.put("KLMP", 3.20);
        mapa.put("QRST", 2.50);

        String codigoProduto = IO.readln("Informe o código do produto: ");
        int quantidade = Integer.parseInt(IO.readln("Informe a quantidade: "));

        if (mapa.containsKey(codigoProduto)) {
            IO.println("Valor total: " + (mapa.get(codigoProduto) * quantidade));
        } else {
            throw new RuntimeException("Código inválido ou inexistente: " + codigoProduto);
        }

    }
}
