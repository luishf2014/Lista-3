public class Risco {
    private String nome;
    private int idade;
    private String grupoRisco;

    public Risco(){

    }

    public Risco(String nome, int idade, String grupoRisco){
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    // --------- Nome ----------
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    // --------- Idade ----------
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    // --------- Grupo de risco ----------
    public String getGrupoRisco(){
        return this.grupoRisco;
    }
    
    public void setGrupoRisco(String grupoRisco){
        this.grupoRisco = grupoRisco;
    }

    public int nivel(int idade, String grupoRisco){
        int categoria;
        if (idade >= 17 && idade <= 20) {
            if (grupoRisco.equals("baixo"))
                categoria = 1;
            else if (grupoRisco.equals("médio"))
                categoria = 2;
            else // grupoRisco.equals("alto")
                categoria = 3;
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco.equals("baixo"))
                categoria = 2;
            else if (grupoRisco.equals("médio"))
                categoria = 3;
            else // grupoRisco.equals("alto")
                categoria = 4;
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco.equals("baixo"))
                categoria = 3;
            else if (grupoRisco.equals("médio"))
                categoria = 4;
            else // grupoRisco.equals("alto")
                categoria = 5;
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco.equals("baixo"))
                categoria = 4;
            else if (grupoRisco.equals("médio"))
                categoria = 5;
            else // grupoRisco.equals("alto")
                categoria = 6;
        } else { // idade >= 65 && idade <= 70
            if (grupoRisco.equals("baixo"))
                categoria = 7;
            else if (grupoRisco.equals("médio"))
                categoria = 8;
            else // grupoRisco.equals("alto")
                categoria = 9;
        }
        return categoria;
    }
}
