public class Prestacao {
    private static final int NUMERO_PRESTACOES = 5;
    private int compra;
    
    public Prestacao(){

    }
     
    public int getCompra(){
        return this.compra;
    }
    
    public void setCompra(int compra){
        this.compra = compra;
    }

    
    // Método para calcular o valor de cada prestação
    public double calcularPrestacao(double compra) {
        return compra / NUMERO_PRESTACOES;
    }
}
