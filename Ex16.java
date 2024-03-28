import java.util.Scanner;

// // Classe para calcular o reajuste salarial dos funcionários
// class ReajusteSalario {
    
//     // Método para calcular o reajuste salarial de acordo com o salário atual
//     public static double calcularReajuste(double salarioAtual, double salarioMinimo) {
//         if (salarioAtual < 3 * salarioMinimo) {
//             return salarioAtual * 0.5; // 50% de reajuste para salários abaixo de três salários mínimos
//         } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
//             return salarioAtual * 0.2; // 20% de reajuste para salários entre três e dez salários mínimos
//         } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
//             return salarioAtual * 0.15; // 15% de reajuste para salários entre dez e vinte salários mínimos
//         } else {
//             return salarioAtual * 0.1; // 10% de reajuste para os demais funcionários
//         }
//     }
// }

public class Ex16 {
    public void ex16() {
        ReajusteSalario reajusteSalario = new ReajusteSalario();
        Scanner leitor = new Scanner(System.in);

        // Solicita o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        reajusteSalario.setSalarioMinimo(leitor.nextDouble());

        // Variável para armazenar o total de reajuste salarial
        double totalReajuste = 0;

        // Loop para calcular o reajuste salarial de cada funcionário
        for (int i = 1; i <= 584; i++) {
            // Solicita o salário atual do funcionário
            System.out.print("\nDigite o salário atual do funcionário " + i + ": ");
            reajusteSalario.setSalarioAtual(leitor.nextDouble());

            // Calcula o reajuste salarial do funcionário
            double reajuste = reajusteSalario.calcularReajuste(reajusteSalario.getSalarioAtual(), reajusteSalario.getSalarioMinimo());

            // Exibe o reajuste salarial do funcionário
            System.out.println("Reajuste do funcionário " + i + ": R$" + reajuste);

            // Atualiza o total de reajuste salarial
            totalReajuste += reajuste;
        }

        // Exibe o total de reajuste salarial concedido pela empresa
        System.out.println("\nTotal de reajuste salarial concedido: R$" + totalReajuste);

        leitor.close();
    }
}
