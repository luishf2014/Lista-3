import java.util.Scanner;

public class Ex21 {
    public void ex21() {
        Turma turma = new Turma();
        Scanner leitor = new Scanner(System.in);

        // Solicita a idade do nadador
        System.out.print("Digite a idade do nadador: ");
        turma.setIdade(leitor.nextInt());

        // Exibe a categoria do nadador
        System.out.println("Categoria do nadador: " + turma.classficacao(turma.getIdade()));

        leitor.close();
    }
}
