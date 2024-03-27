public class Analisador {
    private Double precoCusto;
    private Double precoVenda;

    public Analisador(){

    }

    public Analisador(Double precoCusto, Double precoVenda){
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // ------ Preço de Custo ------
    public Double getPrecoCusto(){
        return this.precoCusto;
    }

    public void setPrecoCusto(Double precoCusto){
        this.precoCusto = precoCusto;
    }

     // ------ Preço de Venda ------
     public Double getPrecoVenda(){
        return this.precoVenda;
    }

    public void setPrecoVenda(Double precoVenda){
        this.precoVenda = precoVenda;
    }

    // ------ Método para determinar se houve lucro, prejuízo ou empate -----
    public static String analisar(double precoCusto, double precoVenda) {
        if (precoVenda > precoCusto) {
            return "Lucro";
        } else if (precoVenda < precoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }

}
