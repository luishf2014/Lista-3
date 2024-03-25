import java.util.Scanner;

// LISTA DE EXERCICIO 3

public class Ex01 {
    public void ex01() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.print("Informe sua primeira nota: ");
        int nota1 = leitor.nextInt();

        System.out.print("Informe sua segunda nota: ");
        int nota2 = leitor.nextInt();

        System.out.print("Informe sua terceira nota: ");
        int nota3 = leitor.nextInt();

        int soma = (nota1 + nota2 + nota3);

        double media = soma / 3;

        System.out.println(nome + " sua média é: " + media);

        leitor.close();

    }
}

// Escrever um programa que leia o nome de um aluno e as
// notas das três provas que ele obteveno semestre.
// No final informar o nome do aluno e a sua média (aritmética).
