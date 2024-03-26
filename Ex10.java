import java.util.Scanner;

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

            String mensagem = VerificadorIdade.verificadorIdade(idade);
            
            System.out.println("Pessoa " + i + ": " + mensagem);
        }

        leitor.close();
    }
}
// Faça um programa que receba a idade de um número finito de pessoas e 
// mostre mensagem informando “maior de idade” e “menor de idade” para cada 
// pessoa. Considerar a pessoa com 18anos como maior de idade.