package logica.exercicios61a80;

public class Exercicio69 {

    void main() {

        int idade;

        do {
            idade = Integer.parseInt(IO.readln("Informe uma idade: "));

        } while (idade >= 0);

        IO.println("Idade negativa, encerrando leitura de dados.");
    }
}