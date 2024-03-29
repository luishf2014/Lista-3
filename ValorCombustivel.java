// EXERCICIO 15
public class ValorCombustivel {
    private Double valorVeiculo;
    private String combustivel;
    
    public ValorCombustivel(){

    }

    public ValorCombustivel(Double valorVeiculo, String combustivel){
        this.valorVeiculo = valorVeiculo;
        this.combustivel = combustivel;
    }

    // ------ Valor do Veiculo ------
    public Double getValorVeiculo(){
        return this.valorVeiculo;
    }

    public void setValorVeiculo(Double valorVeiculo){
        this.valorVeiculo = valorVeiculo;
    }
    
    // ------ Combustivel ------
    public String getCombustivel(){
        return this.combustivel;
    }

    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    
    public double calcularDesconto(String combustivel, Double valorVeiculo) {
        double desconto = 0;
        
        // Verifica o tipo de combustível e calcula o desconto correspondente
        switch (combustivel.toLowerCase()) {
            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;
            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;
            case "alcool":
                desconto = valorVeiculo * 0.25;
                break;
            default:
                break;
        }
        
        return desconto;
    }

}