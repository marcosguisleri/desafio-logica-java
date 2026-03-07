package logica.exercicios21a40;

import java.util.HashMap;

public class Exercicio36 {

    void main() {

        HashMap<String, Double> listaProdutos = new HashMap<>();
        listaProdutos.put("1001", 5.32);
        listaProdutos.put("1324", 6.45);
        listaProdutos.put("6548", 2.37);
        listaProdutos.put("0987", 5.32);
        listaProdutos.put("7623", 6.45);

        String codigoProduto = IO.readln("Informe o código do produto: ");
        int quantidade = Integer.parseInt(IO.readln("Informe a quantidade: "));

        if (listaProdutos.containsKey((codigoProduto))) {
            IO.println("Valor total: " + (listaProdutos.get(codigoProduto) * quantidade));
        }

    }

}
