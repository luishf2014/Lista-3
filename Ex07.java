// Classe para calcular o custo ao consumidor de um carro

import java.util.Scanner;

class CustoCarro {
    private static final double PORCENTAGEM_DISTRIBUIDOR = 0.28;
    private static final double IMPOSTOS = 0.45;
    
    // Método para calcular o custo ao consumidor
    public static double CustoConsumidor(double custoFabrica) {
        double custoComImpostos = custoFabrica * (1 + IMPOSTOS);
        double custoComDistribuidor = custoComImpostos * (1 + PORCENTAGEM_DISTRIBUIDOR);
        return custoComDistribuidor;
    }
}

public class Ex07 {
    public void ex07() {
        Scanner leitor = new Scanner(System.in);

        // Solicita o custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = leitor.nextDouble();

        // Calcula o custo ao consumidor
        double custoConsumidor = CustoCarro.CustoConsumidor(custoFabrica);

        // Exibe o custo ao consumidor
        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);

        leitor.close();

    }
}
