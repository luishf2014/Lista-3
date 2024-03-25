//  LISTA DE EXERCICO 3

import java.util.Scanner;

public class Ex03 {
    public void ex03()  {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Informe seu salário fixo: ");
        double salarioFixo = leitor.nextDouble();

        System.out.println("informe o total de vendas feita no mês: ");
        int vendas = leitor.nextInt();

        Double comissao = vendas * 0.15; //15% da soma das vendas

        double salarioFinal = salarioFixo + comissao;

        System.out.println("\n\n\nDados do funcionário");
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário fixo: " + salarioFixo);
        System.out.println("Sua comissão: " + comissao);
        System.out.println("Seu salário Final: " + salarioFinal);

        leitor.close();

    }
}

// //Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
// por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
// informar o seu nome, o salário fixo e salário no final do mês.