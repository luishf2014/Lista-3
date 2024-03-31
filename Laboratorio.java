// EXERCICIO 24
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
    
    // --------- nota Avaliacao ----------
    public Double getNotaAvaliacao(){
        return this.notaAvaliacao;
    }
    
    public void setNotaAvaliacao(Double notaAvaliacao){
        this.notaAvaliacao = notaAvaliacao;
    }

    // --------- Nota Exame ----------
    public Double getNotaExame(){
        return this.notaExame;
    }
    
    public void setNotaExame(Double notaExame){
        this.notaExame = notaExame;
    }

    // Método para calcula a nota final do estudante com base nos pesos
    public double notaFinal(Double notaLaboratorio, Double notaAvaliacao, Double notaExame){
        return (notaLaboratorio * 2 + notaAvaliacao * 3 + notaExame * 5) / 10;
    }
}
