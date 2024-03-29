// EXERCICIO 06
public class CalculadoraPrecoVenda {
    private Double precoCusto;
    private Double percentualAcrescimo;

    public CalculadoraPrecoVenda(){

    }

    public Double getprecoCusto(){
        return this.precoCusto;
    }

    public void setprecoCusto(Double precoCusto){
        this.precoCusto = precoCusto;
    }

    public Double getpercentualAcrescimo(){
        return this.percentualAcrescimo;
    }

    public void setpercentualAcrescimo(Double percentualAcrescimo){
        this.percentualAcrescimo = percentualAcrescimo;
    }
    
    // Método para calcular o preço de venda com base no preço de custo e percentual de acréscimo
    public double calcularPrecoVenda(double precoCusto, double percentualAcrescimo) {
        return precoCusto * (1 + percentualAcrescimo / 100);
    }
}
