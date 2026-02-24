package logica.exercicios21a40;

public class Exercicio23 {

    void main() {

        int idadeTotalEmDias = Integer.parseInt(IO.readln("Digite sua idade em dias: "));

        int anos = idadeTotalEmDias / 365;
        int restoDepoisDosAnos = idadeTotalEmDias % 365;

        int meses = restoDepoisDosAnos / 30;
        int dias = restoDepoisDosAnos % 30;

        IO.println(anos + " ano(s), " + meses + " mes(es), " + dias + " dia(s)");

    }

}
