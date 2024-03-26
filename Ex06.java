import java.util.Scanner;

public class Ex06 {
    public void ex06() {
        CalculadoraPrecoVenda calcular = new CalculadoraPrecoVenda();
        Scanner leitor = new Scanner(System.in);

        // Solicita o preço de custo do produto
        System.out.print("Digite o preço de custo do produto: ");
        calcular.setprecoCusto(leitor.nextDouble());
        // Solicita o percentual de acréscimo
        System.out.print("Digite o percentual de acréscimo (%): ");
        calcular.setpercentualAcrescimo(leitor.nextDouble());

        // Exibe o preço de venda
        System.out.println("O preço de venda do produto é: R$" + calcular.calcularPrecoVenda(calcular.getprecoCusto(), calcular.getpercentualAcrescimo()));

        leitor.close();
    }
}