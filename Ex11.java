import java.util.Scanner;

// Classe para representar uma pessoa
class Pessoa {
    private String nome;
    private char sexo; // 'M' para masculino e 'F' para feminino

    // Construtor da classe Pessoa
    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    // Método para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para obter o sexo da pessoa
    public char getSexo() {
        return sexo;
    }
}

// Classe para contar o número de homens e mulheres
class ContadorGenero {
    private int totalHomens;
    private int totalMulheres;

    // Construtor da classe ContadorGenero
    public ContadorGenero() {
        totalHomens = 0;
        totalMulheres = 0;
    }

    // Método para contar o número de homens e mulheres com base em uma pessoa
    public void contarPessoa(Pessoa pessoa) {
        if (pessoa.getSexo() == 'M') {
            totalHomens++;
        } else if (pessoa.getSexo() == 'F') {
            totalMulheres++;
        }
    }

    // Método para obter o total de homens
    public int getTotalHomens() {
        return totalHomens;
    }

    // Método para obter o total de mulheres
    public int getTotalMulheres() {
        return totalMulheres;
    }
}

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
