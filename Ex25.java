import java.util.Scanner;

public class Ex25 {
    public void ex25() {
        AlunoNota alunoNota = new AlunoNota();
        Scanner leitor = new Scanner(System.in);

        // Solicita o nome e o número de matrícula do estudante
        System.out.print("Digite o nome do estudante: ");
        alunoNota.setNome(leitor.nextLine());

        System.out.print("Digite o número de matrícula do estudante: ");
        alunoNota.setMatricula(leitor.nextInt());

        // Solicita as notas do estudante
        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        alunoNota.setNotaLaboratorio(leitor.nextDouble());

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        alunoNota.setNotaAvaliacao(leitor.nextDouble());

        System.out.print("Digite a nota do exame final (0 a 10): ");
        alunoNota.setNotaExame(leitor.nextDouble());

        // Verifica se as notas estão no intervalo válido
        if (alunoNota.getNotaLaboratorio() < 0 || alunoNota.getNotaLaboratorio() > 10 ||
            alunoNota.getNotaAvaliacao() < 0 || alunoNota.getNotaAvaliacao() > 10 ||
            alunoNota.getNotaExame() < 0 || alunoNota.getNotaExame() > 10) {
            System.out.println("Notas fornecidas fora do intervalo válido (0 a 10).");
            System.exit(1);
        }

        // Exibe os dados do estudante
        System.out.println("\nNome do estudante: " + alunoNota.getNome());
        System.out.println("Número de matrícula: " + alunoNota.getMatricula());
        System.out.println("Nota final: " + alunoNota.notaFinal(alunoNota.getNotaLaboratorio(), alunoNota.getNotaAvaliacao(), alunoNota.getNotaExame()));
        System.out.println("Classificação: " + alunoNota.classificacao(alunoNota.notaFinal(alunoNota.getNotaLaboratorio(), alunoNota.getNotaAvaliacao(), alunoNota.getNotaExame())));
        leitor.close();
    }
}
