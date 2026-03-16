package logica.exercicios41a60;

import java.util.TreeMap;

public class Exercicio45 {

    void main() {

        int idAluno = Integer.parseInt(IO.readln("Informe o código de identificação do aluno: "));

        double nota1 = Double.parseDouble(IO.readln("Informe a primeira nota do aluno: "));
        double nota2 = Double.parseDouble(IO.readln("Informe a segunda nota do aluno: "));
        double nota3 = Double.parseDouble(IO.readln("Informe a terceira nota do aluno: "));

        double mediaExercicios = Double.parseDouble(IO.readln("Informe a média dos exercícios: "));

        double ma = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7.0;

        TreeMap<Double, String> mapa = new TreeMap<>();
        mapa.put(0.0, "E");
        mapa.put(4.0, "D");
        mapa.put(6.0, "C");
        mapa.put(7.5, "B");
        mapa.put(9.0, "A");

        String conceito = mapa.floorEntry(ma).getValue();
        String resultado = conceito.matches("[ABC]") ? "APROVADO" : "REPROVADO";

        IO.println("Código do aluno: " + idAluno);
        IO.println("Nota1: " + nota1 + " Nota2: " + nota2 + " Nota3: " + nota3);
        IO.println("Média dos exercícios: " + mediaExercicios);
        IO.println("Média de aproveitamento: " + ma);
        IO.println("Conceito: " + conceito + " || Resultado: " + resultado);

    }

}
