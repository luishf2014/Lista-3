import java.util.Scanner;

public class Ex05 {
    public void ex05() {
        Prestacao prestacao = new Prestacao();
        
        Scanner leitor = new Scanner(System.in);

        // Solicita o valor da compra
        System.out.print("Digite o valor da compra: ");
        prestacao.setCompra(leitor.nextInt());

        
        // Exibe o valor de cada prestação
        System.out.println("O valor de cada prestação é de: R$" + prestacao.calcularPrestacao(prestacao.getCompra()));

        leitor.close();
    }
}
