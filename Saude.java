// EXERCICIO 23
public class Saude {
    private String nome;
    private char sexo;
    private Double altura;
    private int idade;
    public Saude(){

    }

    public Saude(String nome, char sexo, double altura, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    // --------- Nome ----------
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    // --------- Sexo ----------
    public char getSexo(){
        return this.sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    // --------- Altura ----------
    public Double getAltura(){
        return this.altura;
    }
    
    public void setAltura(Double altura){
        this.altura = altura;
    }

    // --------- Idade ----------
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double peso(char sexo, int idade){
        double pesoIdeal;
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20)
                    pesoIdeal = (72.7 * altura) - 58;
                else if (idade >= 21 && idade <= 39)
                    pesoIdeal = (72.7 * altura) - 53;
                else // idade >= 40
                    pesoIdeal = (72.7 * altura) - 45;
            } else {
                if (idade <= 40)
                    pesoIdeal = (72.7 * altura) - 50;
                else // idade > 40
                    pesoIdeal = (72.7 * altura) - 58;
            }
        } else { // sexo == 'F'
            if (altura <= 1.50) {
                if (idade >= 35)
                    pesoIdeal = (62.1 * altura) - 45;
                else // idade < 35
                    pesoIdeal = (62.1 * altura) - 49;
            } else {
                pesoIdeal = (62.1 * altura) - 44.7;
            }
        }
        return pesoIdeal;
    }
    
}
