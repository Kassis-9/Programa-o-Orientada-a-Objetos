import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {

        // 1. Recebe os dados do usuário usando JOptionPane
        String inputTransacao = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        double valorTransacao = Double.parseDouble(inputTransacao);

        String inputVenal = JOptionPane.showInputDialog("Digite o valor venal de referência do imóvel:");
        double valorVenal = Double.parseDouble(inputVenal);

        String inputPercentual = JOptionPane.showInputDialog("Digite o percentual de imposto (ex: 2.5 para 2,5%):");
        double percentualImposto = Double.parseDouble(inputPercentual);

        // 2. Encontra o maior valor entre a transação e o valor venal
        double baseCalculo;
        if (valorTransacao > valorVenal) {
            baseCalculo = valorTransacao;
        } else {
            baseCalculo = valorVenal;
        }

        // 3. Calcula o valor do imposto
        double valorITBI = (baseCalculo * percentualImposto) / 100;

        // 4. Exibe o resultado usando JOptionPane
        String mensagem = "Valor de Transação: R$ " + String.format("%.2f", valorTransacao) + "\n"
                        + "Valor Venal: R$ " + String.format("%.2f", valorVenal) + "\n"
                        + "Base de Cálculo do ITBI: R$ " + String.format("%.2f", baseCalculo) + "\n"
                        + "Percentual de Imposto: " + String.format("%.2f", percentualImposto) + "%\n"
                        + "----------------------------------\n"
                        + "Valor do ITBI a ser pago: R$ " + String.format("%.2f", valorITBI);

        JOptionPane.showMessageDialog(null, mensagem, "Cálculo do ITBI", JOptionPane.INFORMATION_MESSAGE);
    }
}
// End of recent edits]