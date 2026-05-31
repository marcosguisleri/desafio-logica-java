package logica.exercicios101a123;

public class Exercicio123 {

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferencaX = x2 - x1;
        double diferencaY = y2 - y1;

        return Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));
    }

    void main() {

        IO.println("=== COORDENADAS DO PONTO A ===");
        double xA = Double.parseDouble(IO.readln("Informe o valor de xA: "));
        double yA = Double.parseDouble(IO.readln("Informe o valor de yA: "));

        IO.println("\n=== COORDENADAS DO PONTO B ===");
        double xB = Double.parseDouble(IO.readln("Informe o valor de xB: "));
        double yB = Double.parseDouble(IO.readln("Informe o valor de yB: "));

        IO.println("\n=== COORDENADAS DO PONTO C ===");
        double xC = Double.parseDouble(IO.readln("Informe o valor de xC: "));
        double yC = Double.parseDouble(IO.readln("Informe o valor de yC: "));

        double ladoAB = calcularDistancia(xA, yA, xB, yB);
        double ladoBC = calcularDistancia(xB, yB, xC, yC);
        double ladoCA = calcularDistancia(xC, yC, xA, yA);

        double perimetro = ladoAB + ladoBC + ladoCA;

        double semiperimetro = perimetro / 2;

        double area = Math.sqrt(
                semiperimetro *
                        (semiperimetro - ladoAB) *
                        (semiperimetro - ladoBC) *
                        (semiperimetro - ladoCA)
        );

        IO.println("\n=== RESULTADO ===");
        IO.println("Lado AB: " + ladoAB);
        IO.println("Lado BC: " + ladoBC);
        IO.println("Lado CA: " + ladoCA);
        IO.println("Perímetro: " + perimetro);
        IO.println("Área: " + area);
    }
}