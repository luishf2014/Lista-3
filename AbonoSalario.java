// EXERCICIO 18
public class AbonoSalario {
    private String nome;
    private String sexo;
    private int idade;
    private Double fixo;

    public AbonoSalario(){

    }
    public AbonoSalario(String nome, String sexo, int idade, Double fixo){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.fixo = fixo;
    }
    // -------- Nome --------
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // -------- Sexo --------
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    // -------- Idade --------
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    // -------- Salario fixo --------
    public Double getFixo(){
        return this.fixo;
    }
    
    public void setFixo(Double fixo){
        this.fixo = fixo;
    }
    // Método para calcular o abono de acordo com o sexo e a idade
    public double abono() {
        if (sexo.equalsIgnoreCase("M")) {
            return (idade >= 30) ? 100.0 : 50.0;
        } else if (sexo.equalsIgnoreCase("F")) {
            return (idade >= 30) ? 200.0 : 80.0;
        }
        return 0.0; // Retorna 0 se o sexo não for M ou F
    }
}
