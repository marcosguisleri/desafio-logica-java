package logica.exercicios1a20;

public class Exercicio10 {

    void main() {

        int quantidadeCamisetasPequenas = Integer.parseInt(IO.readln("Informe a quantidade de camisetas pequenas: "));
        int quantidadeCamisetasmMedias = Integer.parseInt(IO.readln("Informe a quantidade de camisetas médias: "));
        int quantidadeCamisetasGrandes = Integer.parseInt(IO.readln("Informe a quantidade de camisetas grandes: "));

        IO.println("Quantidade total de camisetas: " + (quantidadeCamisetasPequenas + quantidadeCamisetasmMedias + quantidadeCamisetasGrandes));
        IO.println("Valor total das camisetas: R$ " + ((quantidadeCamisetasPequenas * 8) + (quantidadeCamisetasmMedias * 10) + (quantidadeCamisetasGrandes * 15)));

    }

}
