import java.util.Scanner;

public class Ex15 {
    public void ex15() {
        ValorCombustivel valorCombustivel = new ValorCombustivel();
        Scanner leitor = new Scanner(System.in);

        // Variáveis para armazenar o total de desconto e o total pago pelos clientes
        double totalDesconto = 0;
        double totalPago = 0;

        // Loop para calcular desconto e valor a ser pago pelo cliente
        while (true) {
            // Solicita o tipo de combustível do veículo
            System.out.print("Digite o tipo de combustível (álcool/gasolina/diesel): ");
            valorCombustivel.setCombustivel(leitor.nextLine());

            // Encerra o loop se o tipo de combustível for vazio ou nulo
            if (valorCombustivel.getCombustivel().isEmpty()) {
                break;
            }

            // Solicita o valor do veículo
            System.out.print("Digite o valor do veículo: ");
            valorCombustivel.setValorVeiculo(leitor.nextDouble());
            leitor.nextLine(); // Limpa o buffer do leitor

            // Calcula o desconto com base no tipo de combustível
            double desconto = valorCombustivel.calcularDesconto(valorCombustivel.getCombustivel(), valorCombustivel.getValorVeiculo());

            // Calcula o valor a ser pago pelo cliente (valor original - desconto)
            // valorCombustivel.valorPago(valorCombustivel.getValorVeiculo(), desconto);
            double valorPago = valorCombustivel.getValorVeiculo() - desconto;

            // Exibe o valor do desconto e o valor a ser pago pelo cliente
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);

            // Atualiza o total de desconto e o total pago pelos clientes
            totalDesconto += desconto;
            totalPago += valorPago;
        }

        // Exibe o total de desconto e o total pago pelos clientes
        System.out.println("\nTotal de desconto concedido: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

        leitor.close();
    }
}
