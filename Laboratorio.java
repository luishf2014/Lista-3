public class Laboratorio {
    private Double notaLaboratorio;
    private Double notaAvaliacao;
    private Double notaExame;

    public Laboratorio(){

    }

    public Laboratorio(Double notaLaboratorio, Double notaAvaliacao, Double notaExame){
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacao = notaAvaliacao;
        this.notaExame = notaExame;
    }

    // --------- Nota Laboratorio ----------
    public Double getNotaLaboratorio(){
        return this.notaLaboratorio;
    }
    
    public void setNotaLaboratorio(Double notaLaboratorio){
        this.notaLaboratorio = notaLaboratorio;
    }
    
    // --------- notaAvaliacao ----------
    public Double getNotaAvaliacao(){
        return this.notaLaboratorio;
    }
    
    public void setNotaAvaliacao(Double notaAvaliacao){
        this.notaAvaliacao = notaAvaliacao;
    }

    // --------- Nome ----------
    public Double getNotaExame(){
        return this.notaLaboratorio;
    }
    
    public void setNotaExame(Double notaExame){
        this.notaExame = notaExame;
    }

    // Método para calcula a nota final do estudante com base nos pesos
    public double notaFinal(Double notaLaboratorio, Double notaAvaliacao, Double notaExame){
        return (notaLaboratorio * 2 + notaAvaliacao * 3 + notaExame * 5) / 10;
    }
}
