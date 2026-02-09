package logica.exercicios1a20;

public class Exercicio12 {

    void main() {

        int totalDias = Integer.parseInt(IO.readln("Informe a quantidade de dias: "));

        int anos = totalDias / 360;
        int meses =  (totalDias % 360) / 30;
        int dias = (totalDias % 360) % 30;

        IO.println("Quantidade de anos: " + anos + " | Quantidade de meses: " + meses +  " | Quantidade de dias: " + dias);

    }

}
