// Classe para calcular o valor das prestações

import java.util.Scanner;

class CalculadoraPrestacoes {
    private static final int NUMERO_PRESTACOES = 5;
    
    // Método para calcular o valor de cada prestação
    public static double calcularPrestacao(double compra) {
        return compra / NUMERO_PRESTACOES;
    }
}

public class Ex05 {
    public void ex05() {
        Scanner leitor = new Scanner(System.in);

        // Solicita o valor da compra
        System.out.print("Digite o valor da compra: ");
        double compra = leitor.nextDouble();

        // Calcula o valor de cada prestação
        double prestacao = CalculadoraPrestacoes.calcularPrestacao(compra);

        // Exibe o valor de cada prestação
        System.out.println("O valor de cada prestação é: R$" + prestacao);

        leitor.close();
    }
}
