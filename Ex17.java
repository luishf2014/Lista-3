import java.util.Scanner;

public class Ex17 {
    public void ex17() {
        Salario salario = new Salario();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        salario.setNome(leitor.nextLine());

        System.out.print("Digite o salário do funcionário: ");
        salario.setSalario(leitor.nextDouble());

        System.out.print("Digite o valor do salário mínimo: ");
        salario.setSalarioMinimo(leitor.nextDouble());

        System.out.print("Digite o percentual de aumento: ");
        salario.setPercentualAumento(leitor.nextDouble());

        double novoSalario = salario.calcularReajuste(salario.getSalarioMinimo(), salario.getPercentualAumento());
        double aumentoFolha = salario.calcularAumentoFolha(novoSalario);

        System.out.println("\nNome do funcionário: " + salario.getNome());
        System.out.println("Reajuste: " + aumentoFolha);
        System.out.println("Novo salário: " + novoSalario);

        leitor.close();
    }
}
