import java.util.Scanner;

// LISTA DE EXERCICIO 3

public class Ex01 {
    public void ex01() {
        Aluno aluno = new Aluno();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        aluno.setNome(leitor.nextLine());

        System.out.print("Informe sua primeira nota: ");
        aluno.setNota1(leitor.nextDouble());

        System.out.print("Informe sua segunda nota: ");
        aluno.setNota2(leitor.nextDouble());

        System.out.print("Informe sua terceira nota: ");
        aluno.setNota3(leitor.nextDouble());

        System.out.println(aluno.getNome() + " sua média é: " + aluno.media(aluno.getNota1(), aluno.getNota2(), aluno.getNota3()));

        leitor.close();

    }
}

// Escrever um programa que leia o nome de um aluno e as
// notas das três provas que ele obteveno semestre.
// No final informar o nome do aluno e a sua média (aritmética).
