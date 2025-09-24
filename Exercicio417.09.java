import javax.swing.JOptionPane;

public class CalculadoraMedia {

    public static void main(String[] args) {

        // Solicita as notas usando caixas de diálogo e converte para double
        String inputProva1 = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        double notaProva1 = Double.parseDouble(inputProva1);

        String inputProva2 = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        double notaProva2 = Double.parseDouble(inputProva2);

        String inputTrabalho = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        double notaTrabalho = Double.parseDouble(inputTrabalho);

        // Calcula a média das notas
        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3.0;

        // Define o resultado baseado na média
        String resultado;
        if (media >= 6.0) {
            resultado = "Aprovado!";
        } else {
            resultado = "Reprovado.";
        }

        // Constrói a mensagem final para exibição
        String mensagem = "Notas fornecidas:\n"
                        + "Prova 1: " + notaProva1 + "\n"
                        + "Prova 2: " + notaProva2 + "\n"
                        + "Trabalho: " + notaTrabalho + "\n\n"
                        + "Média Final: " + String.format("%.2f", media) + "\n"
                        + "Resultado: " + resultado;

        // Exibe a mensagem final em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}