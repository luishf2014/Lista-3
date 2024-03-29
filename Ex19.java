import java.util.Scanner;

public class Ex19 {
    public void ex19() {
        Triangulo triangulo = new Triangulo();
        Scanner leitor = new Scanner(System.in);

        // Solicita os três valores inteiros representando os lados do triângulo
        System.out.println("Digite os três valores inteiros representando os lados do triângulo:");
        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();

        // Verifica se os lados formam um triângulo
        if (triangulo.verificarTriangulo(lado1, lado2, lado3)) {
            // Verifica o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um triângulo isóscele.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }

        leitor.close();
    }
}
