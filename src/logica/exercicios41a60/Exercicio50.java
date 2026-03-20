package logica.exercicios41a60;

import java.util.Scanner;

public class Exercicio50 {

    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Informe um valor inteiro positivo (negativo para parar): ");
            int valor = sc.nextInt();

            if (valor < 0) {
                break;
            }

            soma += valor;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Média aritmética: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

    }
}
