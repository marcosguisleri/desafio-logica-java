package logica.exercicios21a40;

public class Exercicio23 {

    void main() {

        int idadeEmDias = Integer.parseInt(IO.readln("Informe sua idade em dias: "));

        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias % 365) / 30;
        int dias = (idadeEmDias % 365) % 30;

        IO.println(anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s)");

    }

}
