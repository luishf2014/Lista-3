// EXERCICIO 21
public class Turma {
    private int idade;
    

    public Turma(){

    }

    public Turma(int idade){
        this.idade = idade;        
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String classficacao(int idade){
        String categoria;
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior";
        } else {
            categoria = "Idade fora da faixa etária";
        }
        return categoria;
    }
}