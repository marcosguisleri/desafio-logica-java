package logica.exercicios21a40;

public class Exercicio29 {

    void main() {

        int idade = Integer.parseInt(IO.readln("Informe a idade do nadador: "));

        if (idade < 5) {
            IO.println("idade inválida");
        } else if (idade <= 7) {
            IO.println("infantil A");
        } else if (idade <= 10) {
            IO.println("infantil B");
        } else if (idade <= 13) {
            IO.println("juvenil A");
        } else if (idade <= 17) {
            IO.println("juvenil B");
        } else { // >= 18
            IO.println("adulto");
        }

    }

}
