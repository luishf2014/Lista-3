import java.util.Scanner;

public class Ex08 {
    public void ex08() {
        Escola escola = new Escola();
        Scanner leitor = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        escola.setNome(leitor.nextLine());

        // Solicita as três notas do aluno
        System.out.print("Digite a nota da primeira prova: ");
        escola.setNota1(leitor.nextDouble());

        System.out.print("Digite a nota da segunda prova: ");
        escola.setNota2(leitor.nextDouble());


        System.out.print("Digite a nota da terceira prova: ");
        escola.setNota3(leitor.nextDouble());

        // Exibe o nome, a média e a menção do aluno
        
        System.out.println(escola.getNome() + " sua média do aluno: " + escola.media());
        System.out.println("Menção do aluno: " + escola.aprovacao(escola.media()));

        leitor.close();
    }
}