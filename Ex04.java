import java.util.Scanner;

public class Ex04 {
    public void ex04() {
        ConversorDolarReal conversor = new ConversorDolarReal();
        Scanner leitor = new Scanner(System.in);

        // Solicita a cotação do dólar
        System.out.print("Informe a cotação do dólar (R$): ");
        conversor.setCotacao(leitor.nextDouble());

        // Solicita a quantidade de dólares disponíveis
        System.out.print("Informe a quantidade de dólares disponíveis: ");
        conversor.setQuantidadeDolar(leitor.nextDouble());

        // Exibe o valor em reais
        System.out.println("O valor correspondente em reais é: R$" + conversor.valorEmReais(conversor.getQuantidadeDolar()));

        leitor.close();
    }
}
