import java.util.Scanner;

public class Ex22 {
    
    public void ex22() {
        Casa casa = new Casa();
        Scanner leitor = new Scanner(System.in);

        // Solicita o tipo de cliente
        System.out.println("Selecione o tipo de cliente");
        System.out.println("1 - Residencial");
        System.out.println("2 - Comercial");
        System.out.println("3 - Industrial");
        System.out.print("Digite o número correspondente ao tipo de cliente: ");
        int tipoCliente = leitor.nextInt();

        // Verifica se o tipo de cliente é válido
        if (tipoCliente < 1 || tipoCliente > 3) {
            System.out.println("Tipo de cliente inválido.");
            return;
        }

        // Solicita o consumo de energia em kWh
        System.out.print("Digite o consumo de energia em kWh: ");
        casa.setConsumo(leitor.nextDouble());
        
        // Calcula o valor total da conta de luz
        double valorConta = casa.getConsumo() * casa.energia(casa.getConsumo(), tipoCliente);

        // Exibe o valor da conta de luz
        System.out.println("O valor da conta de luz é: R$" + valorConta);

        leitor.close();
    }
}
