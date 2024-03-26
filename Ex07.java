// Classe para calcular o custo ao consumidor de um carro

import java.util.Scanner;



public class Ex07 {
    public void ex07() {
        CustoCarro custoCarro = new CustoCarro();

        Scanner leitor = new Scanner(System.in);

        // Solicita o custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: ");
        custoCarro.setCustoFabrica(leitor.nextDouble());

        // Exibe o custo ao consumidor
        System.out.println("O custo ao consumidor do carro é: R$" + custoCarro.CustoConsumidor(custoCarro.getCustoFabrica()));

        leitor.close();

    }
}
