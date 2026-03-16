package logica.exercicios41a60;

public class Exercicio46 {

    void main() {

        double indicePoluicao = Double.parseDouble(IO.readln("Informe o índice de poluição: "));

        if (indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
            IO.println("Índice aceitável. Nenhuma notificação é necessária.");
        } else if (indicePoluicao >= 0.30 && indicePoluicao < 0.40) {
            IO.println("Intimação: empresas do 1° grupo devem suspender suas atividades.");
        } else if (indicePoluicao >= 0.40 && indicePoluicao < 0.50) {
            IO.println("Intimação: empresas do 1° e 2° grupo devem suspender suas atividades.");
        } else if (indicePoluicao >= 0.50) {
            IO.println("Intimação: empresas do 1°, 2° e 3° grupo devem suspender suas atividades.");
        } else {
            IO.println("Valor inválido ou fora da faixa considerada.");
        }

    }
}
