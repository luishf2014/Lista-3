// EXERCICIO 19
public class Triangulo {
    // Método para verificar se os lados formam um triângulo
    public boolean verificarTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}