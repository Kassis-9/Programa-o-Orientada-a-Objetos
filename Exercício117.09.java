import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProdutoDesconto {
    public static void main(String[] args) {
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Digite o valor do produto: ");
            Double valorProduto = Double.parseDouble(br.readLine());
            
            System.out.print("Digite o percentual do desconto: ");
            Double percentual = Double.parseDouble(br.readLine());
            
            // Cálculo do desconto
            Double desconto = valorProduto * percentual / 100;
            Double valorFinal = valorProduto - desconto;
            
            // Resultado
            System.out.println("Valor do desconto: R$ " + desconto);
            System.out.println("Valor final com desconto: R$ " + valorFinal);
            
        } catch (IOException e) {
            System.out.println("Erro de entrada de dados: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Valor digitado inválido.");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o leitor: " + e.getMessage());
            }
        }
    }
}
