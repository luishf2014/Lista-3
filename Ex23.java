import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex23 {
    public void ex23() {
        Saude saude = new Saude();
        Scanner leitor = new Scanner(System.in);

        // Solicita o nome da pessoa
        System.out.print("Digite o nome da pessoa: ");
        saude.setNome(leitor.nextLine());

        // Solicita o sexo da pessoa
        System.out.print("Digite o sexo da pessoa (M/F): ");
        saude.setSexo(leitor.next().charAt(0));

        // Solicita a altura da pessoa
        System.out.print("Digite a altura da pessoa (em metros): ");
        saude.setAltura(leitor.nextDouble());

        // Solicita a idade da pessoa
        System.out.print("Digite a idade da pessoa: ");
        saude.setIdade(leitor.nextInt());

        // Exibe o nome da pessoa e seu peso ideal
        System.out.println("Nome: " + saude.getNome());
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Peso Ideal: " + formato.format(saude.peso(saude.getSexo(), saude.getIdade())) + " kg");

        leitor.close();
    }
}
