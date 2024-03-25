// Classe para calcular o preço de venda

import java.util.Scanner;

class CalculadoraPrecoVenda {
    
    // Método para calcular o preço de venda com base no preço de custo e percentual de acréscimo
    public static double calcularPrecoVenda(double precoCusto, double percentualAcrescimo) {
        return precoCusto * (1 + percentualAcrescimo / 100);
    }
}

public class Ex06 {
    public void ex06() {
        Scanner leitor = new Scanner(System.in);

        // Solicita o preço de custo do produto
        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = leitor.nextDouble();

        // Solicita o percentual de acréscimo
        System.out.print("Digite o percentual de acréscimo (%): ");
        double percentualAcrescimo = leitor.nextDouble();

        // Calcula o preço de venda
        double precoVenda = CalculadoraPrecoVenda.calcularPrecoVenda(precoCusto, percentualAcrescimo);

        // Exibe o preço de venda
        System.out.println("O preço de venda do produto é: R$" + precoVenda);

        leitor.close();
    }
}