public class Escola {
    private String nome;
    private double nota1, nota2, nota3;

    public Escola(){

    }
    // Construtor da classe Aluno
    public Escola(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para obter o nome do aluno
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    // Método para obter as notas do aluno
    // Nota 1
    public Double getNota1(){
        return this.nota1;
    }
    
    public void setNota1(Double nota1){
        this.nota1 = nota1;
    }

    // Nota 2
    public Double getNota2(){
        return this.nota2;
    }
    
    public void setNota2(Double nota2){
        this.nota2 = nota2;
    }

    // Nota 3
    public Double getNota3(){
        return this.nota3;
    }
    
    public void setNota3(Double nota3){
        this.nota3 = nota3;
    }
    
    // Método para calcular a média do aluno
    public double media() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para determinar a menção do aluno
    public String aprovacao(double d) {
        double media = media();
        if (media >= 7) {
            return "Aprovado";
        } else if(media  <= 6.9 || media >= 5.1){
            return "Recuperação";
        }else if (media <= 5) {
            return "Reprovado";
        } 
        return nome;
    }
 
}
