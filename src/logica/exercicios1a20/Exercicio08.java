package logica.exercicios1a20;

public class Exercicio08 {

    void main() {

        int dia = Integer.parseInt(IO.readln("Digite o dia: "));
        int mes = Integer.parseInt(IO.readln("Digite o mes: "));

        int totalDias = ((mes - 1) * 30) + dia;

        IO.println("Já se passaram " + totalDias + "/365 dias desde do inicio do ano.");

    }

}
