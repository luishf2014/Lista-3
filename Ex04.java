import java.util.Scanner;

// Classe para lidar com a conversão de dólar para real
class ConversorDolarReal {
    private double cotacao;

    // Construtor que recebe a cotação do dólar
    public ConversorDolarReal(double cotacao) {
        this.cotacao = cotacao;
    }

    // Método para calcular a conversão de dólar para real
    public double converterDolarParaReal(double quantidadeDolar) {
        return quantidadeDolar * cotacao;
    }
}

public class Ex04 {
    public void ex04() {
        Scanner leitor = new Scanner(System.in);

        // Solicita a cotação do dólar
        System.out.print("Informe a cotação do dólar (R$): ");
        double cotacaoDolar = leitor.nextDouble();

        // Solicita a quantidade de dólares disponíveis
        System.out.print("Informe a quantidade de dólares disponíveis: ");
        double quantidadeDolar = leitor.nextDouble();

        // Cria uma instância do ConversorDolarReal com a cotação fornecida
        ConversorDolarReal conversor = new ConversorDolarReal(cotacaoDolar);

        // Calcula o valor correspondente em reais
        double valorEmReais = conversor.converterDolarParaReal(quantidadeDolar);

        // Exibe o valor em reais
        System.out.println("O valor correspondente em reais é: R$" + valorEmReais);

        leitor.close();
    }
}
