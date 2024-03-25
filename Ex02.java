// LISTA DE EXERCICIO 3

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex02 {
    public void ex02() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe a ditâcia total da viagem: ");
        int distacia = leitor.nextInt();

        System.out.println("Agora informe o valor de combustível gasto: ");
        Double combustivel = leitor.nextDouble();

        Double consumo = distacia / combustivel;

        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("O consumo médio é: " + formato.format(consumo));

        leitor.close();
    }
}

// Escrever um programa para determinar o consumo médio de um
// automóvel sendo fornecida a distância total percorrida pelo
// automóvel e o total de combustível gasto