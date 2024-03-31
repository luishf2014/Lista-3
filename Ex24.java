import java.util.Scanner;

public class Ex24 {
    public void ex24() {
        Laboratorio laboratorio = new Laboratorio();
        Scanner leitor = new Scanner(System.in);

        // Solicita as notas do estudante
        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        laboratorio.setNotaLaboratorio(leitor.nextDouble());

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        laboratorio.setNotaAvaliacao(leitor.nextDouble());

        System.out.print("Digite a nota do exame final (0 a 10): ");
        laboratorio.setNotaExame(leitor.nextDouble());

        // Verifica se as notas estão no intervalo válido
        if (laboratorio.getNotaLaboratorio() < 0 || laboratorio.getNotaLaboratorio() > 10 ||
            laboratorio.getNotaAvaliacao() < 0 || laboratorio.getNotaAvaliacao() > 10 ||
            laboratorio.getNotaExame() < 0 || laboratorio.getNotaExame() > 10) {
            System.out.println("Notas fornecidas fora do intervalo válido (0 a 10).");
            return;
        }

       // Exibe a nota final do estudante
        System.out.println("A nota final do estudante é: " + laboratorio.notaFinal(laboratorio.getNotaLaboratorio(), laboratorio.getNotaAvaliacao(), laboratorio.getNotaExame()));

        leitor.close();
    }
}
