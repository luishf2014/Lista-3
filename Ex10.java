import java.util.Scanner;

// Classe para verificar se uma pessoa é maior de idade ou menor de idade
class Verificaidade {
    
    // Método para verificar se uma pessoa é maior de idade
    public static boolean MaiorIdade(int idade) {
        return idade >= 18;
    }
}

public class Ex10 {
    public void ex10() {
        Scanner leitor = new Scanner(System.in);

        // Solicita o número de pessoas
        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = leitor.nextInt();

        // Loop para iterar sobre cada pessoa
        for (int i = 1; i <= numeroPessoas; i++) {
            // Solicita a idade da pessoa
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = leitor.nextInt();

            // Verifica se a pessoa é maior de idade ou menor de idade e exibe a mensagem correspondente
            if (Verificaidade.MaiorIdade(idade)) {
                System.out.println("Pessoa " + i + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + i + ": Menor de idade");
            }
        }

        leitor.close();
    }
}
