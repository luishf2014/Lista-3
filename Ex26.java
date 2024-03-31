import java.util.Scanner;

public class Ex26 {
    public void ex26() {
        Risco risco = new Risco();
        Scanner leitor = new Scanner(System.in);

        // Solicita o nome, idade e grupo de risco do pretendente
        System.out.print("Digite o nome do pretendente: ");
        risco.setNome(leitor.next());

        System.out.print("Digite a idade do pretendente: ");
        risco.setIdade(leitor.nextInt());

        System.out.print("Digite o grupo de risco do pretendente (baixo, médio ou alto): ");
        risco.setGrupoRisco(leitor.next().toLowerCase()); // Convertendo para minúsculas para facilitar a comparação

        // Verifica se a idade está dentro da faixa permitida
        if (risco.getIdade() < 17 || risco.getIdade() > 70) {
            System.out.println("Desculpe, o pretendente não se enquadra em nenhuma das categorias ofertadas.");
            System.exit(1);
        }

        // Exibe os dados do pretendente e sua categoria
        System.out.println("\n\nNome do pretendente: " + risco.getNome());
        System.out.println("Idade do pretendente: " + risco.getIdade());
        System.out.println("Grupo de risco do pretendente: " + risco.getGrupoRisco());
        System.out.println("Categoria do pretendente: " + risco.nivel(risco.getIdade(), risco.getGrupoRisco()));

        leitor.close();
    }
}
