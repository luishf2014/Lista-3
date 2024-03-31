// EXERCICIO 25
public class AlunoNota {
    private String nome;
    private int matricula;
    private Double notaLaboratorio;
    private Double notaAvaliacao;
    private Double notaExame;

    public AlunoNota(){

    }

    public AlunoNota(String nome, int matricula,Double notaLaboratorio, Double notaAvaliacao, Double notaExame){
        this.nome = nome;
        this.matricula = matricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacao = notaAvaliacao;
        this.notaExame = notaExame;
    }

    // --------- Nome aluno ----------
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    // --------- Matricula aluno ----------
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
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

    public String classificacao(Double notaFinal){
        String Status;
        if (notaFinal >= 8 && notaFinal <= 10) {
            Status = "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            Status = "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            Status = "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            Status = "D";
        } else {
            Status = "R";
        }
        return Status;
    }
}   
