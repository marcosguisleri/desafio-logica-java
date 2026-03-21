package logica.exercicios41a60;

public class Exercicio51And52 {

    void main() {
        int[] candidatos = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;

        while (true) {
            int voto = Integer.parseInt(IO.readln("Informe o voto (1-4 candidatos, 5 nulo, 6 branco, 0 encerra): "));

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1, 2, 3, 4 -> candidatos[voto - 1]++;
                case 5 -> votosNulos++;
                case 6 -> votosBrancos++;
                default -> IO.println("Voto inválido. Use 1-6 ou 0 para encerrar.");
            }
        }

        for (int i = 0; i < candidatos.length; i++) {
            IO.println("Candidato " + (i + 1) + ": " + candidatos[i]);
        }
        IO.println("Votos nulos: " + votosNulos);
        IO.println("Votos brancos: " + votosBrancos);
    }
}
