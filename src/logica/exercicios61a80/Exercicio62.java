package logica.exercicios61a80;

public class Exercicio62 {

    void main() {

        int contador = 0;

        while (true) {
            double valor = Double.parseDouble(IO.readln("Informe um valor: "));
            if (valor < 0) break;
            
            if (contador % 20 == 0) {
                System.out.printf("%-10s %-10s %-10s %-15s%n",
                        "Valor", "Quadrado", "Cubo", "Raiz Quadrada");
                IO.println("-----------------------------------------------------------");
            }

            double quadrado = Math.pow(valor, 2);
            double cubo = Math.pow(valor, 3);
            double raiz = Math.sqrt(valor);

            System.out.printf("%-10.2f %-10.2f %-10.2f %-15.4f%n",
                    valor, quadrado, cubo, raiz);

            contador++;
        }

    }

}
