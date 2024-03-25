import java.util.Scanner;

// Classe para calcular o desconto com base no ano do veículo
class Desconto {
    
    // Método para calcular o desconto com base no ano do veículo
    public static double calcularDesconto(int ano) {
        if (ano <= 2000) {
            return 0.12; // 12% de desconto para veículos até 2000
        } else {
            return 0.07; // 7% de desconto para veículos acima de 2000
        }
    }
}

public class Ex12 {
    public void ex12() {
        Scanner leitor = new Scanner(System.in);

        // Variáveis para contabilizar o total de carros até 2000 e o total geral
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        // Loop para calcular desconto de vários carros
        while (true) {
            // Solicita o ano do veículo
            System.out.print("Digite o ano do veículo: ");
            int anoVeiculo = leitor.nextInt();

            // Calcula o desconto com base no ano do veículo
            double desconto = Desconto.calcularDesconto(anoVeiculo);

            // Exibe o valor do desconto
            System.out.println("Desconto: " + (desconto * 100) + "%");

            // Calcula o valor a ser pago pelo cliente (valor original - desconto)
            double valorOriginal = 20000; // Exemplo de valor original
            double valorComDesconto = valorOriginal - (valorOriginal * desconto);

            // Exibe o valor a ser pago pelo cliente
            System.out.println("Valor a ser pago pelo cliente: R$" + valorComDesconto);

            // Verifica se o veículo é até 2000 e atualiza o contador correspondente
            if (anoVeiculo <= 2000) {
                totalCarrosAte2000++;
            }

            // Incrementa o total geral de carros
            totalGeral++;

            // Pergunta se deseja continuar calculando desconto
            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            String continuar = leitor.next();
            // !: Este é o operador de negação. Quando precede uma expressão booleana, inverte o seu valor. Ou seja, se a expressão for verdadeira, negá-la a tornará falsa, e vice-versa.
            if (!continuar.equalsIgnoreCase("S")) {
                break; // Encerra o loop se a resposta não for "S"
            }
        }

        // Exibe o total de carros até 2000 e o total geral
        System.out.println("\nTotal de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        leitor.close();
    }
}
