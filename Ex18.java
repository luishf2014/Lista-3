import java.util.Scanner;

public class Ex18 {
    public void ex18() {
        AbonoSalario abonoSalario = new AbonoSalario();
        Scanner leitor = new Scanner(System.in);

        // Solicita o nome do funcionário
        System.out.print("Digite o nome do funcionário: ");
        abonoSalario.setNome(leitor.nextLine());

        // Solicita a idade do funcionário
        System.out.print("Digite a idade do funcionário: ");
        abonoSalario.setIdade(leitor.nextInt());

        // Solicita o sexo do funcionário
        System.out.print("Digite o sexo do funcionário (M/F): ");
        abonoSalario.setSexo(leitor.next());

        // Solicita o salário fixo do funcionário
        System.out.print("Digite o salário fixo do funcionário: ");
        abonoSalario.setFixo(leitor.nextDouble());

        
        
        // Calcula o abono de acordo com o sexo e a idade
        double abono = abonoSalario.abono();
        
        // Calcula o salário líquido acrescido do abono
        double salarioLiquido = abonoSalario.getFixo() + abono;

        // Exibe o nome do funcionário e o salário líquido acrescido do abono
        System.out.println("\nNome do funcionário: " + abonoSalario.getNome());
        System.out.println("valor do abono: " + abono);
        System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);

        leitor.close();
    }
}
