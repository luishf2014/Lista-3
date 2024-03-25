import java.util.Scanner;

// Classe para contar números dentro de um intervalo
class Vetor {
    
    // Método para contar números no intervalo entre 10 e 150 (inclusive)
    public static int contador(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        return contador;
    }
}

public class Ex09 {
    public void ex09() {
        Scanner leitor = new Scanner(System.in);

        // Cria um array para armazenar os números
        int[] numeros = new int[80];

        // Solicita ao usuário que insira os 80 números
        System.out.println("Digite os 80 números :");

        // Lê os números e armazena no array
        for (int i = 0; i < 80; i++) {
            System.out.print("[" + i + "]: ");
            numeros[i] = leitor.nextInt();
        }

        // Chama o método da classe ContadorNumeros para contar os números no intervalo desejado
        int total = Vetor.contador(numeros);

        // Exibe o resultado
        System.out.println("Quantidade de números no intervalo entre 10 e 150 (inclusive): " + total);

        leitor.close();
    }
}
