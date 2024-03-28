public class Funcionario {
    private String nome;
    private Double salarioFixo;
    private int vendas;


public Funcionario(){

}


public Funcionario(String nome, Double salarioFixo){
    this.nome = nome;
    this.salarioFixo = salarioFixo;
}

public String getNome(){
    return this.nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public Double getSalarioFixo(){
    return this.salarioFixo;
}

public void setSalarioFixo(Double salarioFixo){
    this.salarioFixo = salarioFixo;
}

public int getVendas(){
    return this.vendas;
}

public void setVendas(int vendas){
    this.vendas = vendas;
}


public Double salarioFinal(Double salarioFixo, int i){
    return salarioFixo + (i * 0.15);
}
}