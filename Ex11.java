import java.util.Scanner;

public class Ex11 {
    public void ex11() {
        Scanner leitor = new Scanner(System.in);
        ContadorGenero contadorGenero = new ContadorGenero();

        // Loop para ler o nome e o sexo de 56 pessoas
        for (int i = 1; i <= 56; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o nome: ");
            String nome = leitor.next();
            System.out.print("Digite o sexo (M/F): ");
            char sexo = leitor.next().toUpperCase().charAt(0); // Converte para maiúsculas e pega o primeiro caractere

            // Cria uma instância da classe Pessoa com as informações fornecidas
            Pessoa pessoa = new Pessoa(nome, sexo);

            // Conta a pessoa como homem ou mulher
            contadorGenero.contarPessoa(pessoa);
        }

        // Exibe o total de homens e mulheres
        System.out.println("\nTotal de homens: " + contadorGenero.getTotalHomens());
        System.out.println("Total de mulheres: " + contadorGenero.getTotalMulheres());

        leitor.close();
    }
}
