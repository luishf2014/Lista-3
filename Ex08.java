import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double media() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String aprovacao() {
        double media = media();
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperacao";
        }
    }

    public String nome() {
        return nome;
    }
}

public class Ex08 {
    public void ex08() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = leitor.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = leitor.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = leitor.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = leitor.nextDouble();

        Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);

        System.out.println("\nNome do aluno: " + aluno.nome());

        double media = aluno.media();
        String mencao = aluno.aprovacao();

        System.out.println("Media do aluno: " + media);
        System.out.println("Mencao do aluno: " + mencao);

        leitor.close();
    }

    public static void main(String[] args) {
        Ex08 ex08 = new Ex08();
        ex08.ex08(); // Chamada do método ex08()
    }
}
