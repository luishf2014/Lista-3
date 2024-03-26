public class ConversorDolarReal {
    private Double cotacao;
    private Double quantidadeDolar;

    public ConversorDolarReal(){

    }


    public ConversorDolarReal(double cotacao, double quantidadeDolar) {
        this.cotacao = cotacao;
        this.quantidadeDolar = quantidadeDolar;
    }

    public Double getCotacao(){
        return this.cotacao;
    }
    
    public void setCotacao(Double cotacao){
        this.cotacao = cotacao;
    }
    
    public Double getQuantidadeDolar(){
        return this.quantidadeDolar;
    }
    
    public void setQuantidadeDolar(Double quantidadeDolar){
        this.quantidadeDolar = quantidadeDolar;
    }

    
    public double valorEmReais(double quantidadeDolar) {
        return quantidadeDolar * cotacao;
    }
}

