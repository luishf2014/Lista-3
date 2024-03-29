// EXERCICIO 12
// Classe para calcular o desconto com base no ano do veículo
class Desconto {
    
    // Método para calcular o desconto com base no ano do veículo
    public double calcularDesconto(int ano) {
        if (ano <= 2000) {
            return 0.12; // 12% de desconto para veículos até 2000
        } else {
            return 0.07; // 7% de desconto para veículos acima de 2000
        }
    }
}