import java.util.Scanner;

public class Ex20 {
    public void ex20() {
        
        Scanner leitor = new Scanner(System.in);

        // Solicita o nível do professor
        System.out.print("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = leitor.nextInt();

        // Cria um objeto Professor com o nível fornecido
        Professor professor = new Professor(nivel);

        // Solicita o número de horas/aula trabalhadas
        System.out.print("Digite o número de horas/aula trabalhadas: ");
        int horasAula = leitor.nextInt();

        // Calcula o salário do professor
        double salario = professor.calcularSalario(horasAula);

        // Exibe o salário do professor
        System.out.println("O salário do professor é: R$" + salario);

        leitor.close();
    }
}
