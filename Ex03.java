//  LISTA DE EXERCICO 3

import java.util.Scanner;

public class Ex03 {
    public void ex03()  {
        Funcionario funcionario = new Funcionario();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        funcionario.setNome(leitor.nextLine());

        System.out.println("Informe seu salário fixo: ");
        funcionario.setSalarioFixo(leitor.nextDouble());

        System.out.println("informe o total de vendas feita no mês: ");
        funcionario.setVendas(leitor.nextInt());

        System.out.println("\nDados do funcionário");
        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Salário fixo: " + funcionario.getSalarioFixo());
        System.out.println("Seu salário Final: " + funcionario.salarioFinal(funcionario.getSalarioFixo(), funcionario.getVendas()));

        leitor.close();

    }
}

// //Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
// por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
// informar o seu nome, o salário fixo e salário no final do mês.