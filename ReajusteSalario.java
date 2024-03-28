public class ReajusteSalario {
    private Double salarioMinimo;
    private Double salarioAtual;

    public ReajusteSalario(){

    }

    public ReajusteSalario(Double salarioMinimo, Double salarioAtual){
        this.salarioMinimo = salarioMinimo;
        this.salarioAtual = salarioAtual;
    }

    public Double getSalarioMinimo(){
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(Double salarioMinimo){
        this.salarioMinimo = salarioMinimo;
    }


    public Double getSalarioAtual(){
        return this.salarioAtual;
    }

    public void setSalarioAtual(Double salarioAtual){
        this.salarioAtual = salarioAtual;
    
    }
    
    public double calcularReajuste(double salarioAtual, double salarioMinimo) {
        if (salarioAtual < 3 * salarioMinimo) {
            return salarioAtual * 0.5; // 50% de reajuste para salários abaixo de três salários mínimos
        } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
            return salarioAtual * 0.2; // 20% de reajuste para salários entre três e dez salários mínimos
        } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
            return salarioAtual * 0.15; // 15% de reajuste para salários entre dez e vinte salários mínimos
        } else {
            return salarioAtual * 0.1; // 10% de reajuste para os demais funcionários
        }
    }
}
