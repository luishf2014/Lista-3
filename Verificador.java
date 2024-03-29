// EXERCICIO 13
public class Verificador {
    private String nome;
    private String sexo;
    private int idade;
    private String saude;
    
     
    public Verificador(){

    }

    public Verificador(String nome, String sexo, int idade, String saude){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getsaude(){
        return this.saude;
    }
    public void setSaude(String saude){
        this.saude = saude;
    }
    // Método para verificar se uma pessoa está apta para o serviço militar
    public  boolean aptidao(int idade, String saude) {
       return idade >= 18 && idade <= 45 && saude.equalsIgnoreCase("boa");
    }
}

