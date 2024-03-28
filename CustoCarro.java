public class CustoCarro {
    private static final double PORCENTAGEM_DISTRIBUIDOR = 0.28;
    private static final double IMPOSTOS = 0.45;
    private Double custoFabrica;

    public CustoCarro(){

    }

    public Double getCustoFabrica(){
        return this.custoFabrica;
    }

    public void setCustoFabrica(Double custoFabrica){
        this.custoFabrica = custoFabrica;
    }
    
    // Método para calcular o custo ao consumidor
    public double CustoConsumidor(Double custoFabrica) {
        double custoComImpostos = custoFabrica * (1 + IMPOSTOS);
        double custoComDistribuidor = custoComImpostos * (1 + PORCENTAGEM_DISTRIBUIDOR);
        return custoComDistribuidor;
    }
}

