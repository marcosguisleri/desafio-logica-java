package logica.exercicios21a40;

public class Exercicio22 {

    void main() {

        int anos = Integer.parseInt(IO.readln("Informe a quantidade de anos: "));
        int meses = Integer.parseInt(IO.readln("Informe a quantidade de meses: "));
        int dias = Integer.parseInt(IO.readln("Informe a quantidade de dias: "));

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Total de dias: " + totalDias);

    }

}
