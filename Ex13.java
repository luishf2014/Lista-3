import java.util.Scanner;

public class Ex13 {
    public void ex13() {
        Verificador verificador = new Verificador();
        Scanner leitor = new Scanner(System.in);
                
        // Variáveis para contabilizar o total de pessoas aptas e o total geral
        int totalAptos = 0;
        int totalGeral = 0;

        // Solicita o número de pessoas
        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = leitor.nextInt();

        // Loop para iterar sobre as N pessoas
        for (int i = 1; i <= numeroPessoas; i++) {
            // Solicita os dados da pessoa
            System.out.println("\nDados da pessoa " + i + ":");
            System.out.print("Nome: ");
            verificador.setNome(leitor.next());

            System.out.print("Sexo (M/F): ");
            verificador.setSexo(leitor.next());

            System.out.print("Idade: ");
            verificador.setIdade(leitor.nextInt());

            System.out.print("Saúde (Boa/Ruim): ");
            verificador.setSaude(leitor.next());

            // Verifica se a pessoa está apta para o serviço militar
            boolean apto = verificador.aptidao(verificador.getIdade(), verificador.getsaude());

            // Exibe o resultado
            if (apto) {
                System.out.println(verificador.getNome() + " está apto para cumprir o serviço militar obrigatório.");
                totalAptos++;
            } else {
                System.out.println(verificador.getNome() + " não está apto para cumprir o serviço militar obrigatório.");
            }

            // Incrementa o total geral de pessoas
            totalGeral++;
        }

        // Exibe os totais
        System.out.println("\nTotal de pessoas aptas para o serviço militar: " + totalAptos);
        System.out.println("Total geral de pessoas: " + totalGeral);

        leitor.close();
    }
}
