import java.util.Scanner;

public class Ex14 {
    public void ex14() {
        Analisador analisador = new Analisador();
        Scanner leitor = new Scanner(System.in);

        // Variáveis para calcular média de preço de custo e de venda
        double somaCusto = 0;
        double somaVenda = 0;

        // solicita a quantidade de produtos ao usário
        System.out.println("informe a quantidade de produtos: ");
        int tamanho = leitor.nextInt();
        
        // Loop para iterar sobre a quantidade de produtos
        for (int i = 1; i <= tamanho; i++) {
            // Solicita o preço de custo e o preço de venda do produto
            System.out.println("\nProduto " + i + ":");

            System.out.print("Digite o preço de custo: ");
            analisador.setPrecoCusto(leitor.nextDouble());

            System.out.print("Digite o preço de venda: ");
            analisador.setPrecoVenda(leitor.nextDouble());

            // Calcula e exibe se houve lucro, prejuízo ou empate para o produto
            String resultado = Analisador.analisar(analisador.getPrecoCusto(), analisador.getPrecoVenda());
            System.out.println("Resultado para o produto " + i + ": " + resultado);

            // Atualiza as somas para calcular média
            somaCusto += analisador.getPrecoCusto();
            somaVenda += analisador.getPrecoVenda();
        }

        // Calcula e exibe média de preço de custo e de venda
        double mediaCusto = somaCusto / 40;
        double mediaVenda = somaVenda / 40;
        System.out.println("\nMédia de preço de custo: " + mediaCusto);
        System.out.println("Média de preço de venda: " + mediaVenda);

        leitor.close();
    }
}
