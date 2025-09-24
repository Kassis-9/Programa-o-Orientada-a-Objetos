import java.util.Scanner;

public class CampeonatoBrasileiro {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os pontos do líder
        System.out.print("Digite a quantidade de pontos do líder: ");
        int pontosLider = scanner.nextInt();

        // Solicita e lê os pontos do lanterna
        System.out.print("Digite a quantidade de pontos do lanterna: ");
        int pontosLanterna = scanner.nextInt();

        // Calcula a diferença de pontos
        int diferencaPontos = pontosLider - pontosLanterna;

        // Calcula o número de vitórias necessárias
        // A divisão inteira trunca o resultado, então se houver resto,
        // é preciso adicionar mais uma vitória para ultrapassar.
        int vitoriasNecessarias = diferencaPontos / 3;
        if (diferencaPontos % 3 != 0) {
            vitoriasNecessarias++;
        }

        // Exibe o resultado
        System.out.println("O time lanterna precisa de " + vitoriasNecessarias +
                           " vitórias para alcançar ou ultrapassar o líder.");

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
