// EXERCICIO 17
public class Salario {
    private String nome;
    private double salario;
    private double salarioMinimo;
    private double percentualAumento;
    private double novoSalario;

    public Salario(){

    }

    public Salario(String nome, double salario, double salarioMinimo, double percentualAumento, double novoSalario) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
        this.percentualAumento = percentualAumento;
        this.novoSalario = novoSalario;
    }

    // --------- Salário ----------
    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    // -------- Nome ------------
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // ---------- Salário Mínimo -----------
    public double getSalarioMinimo(){
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(Double salarioMinimo){
        this.salarioMinimo = salarioMinimo;
    }

    // --------- Percentual Aumento -----------
    public double getPercentualAumento(){
        return this.percentualAumento;
    }

    public void setPercentualAumento(Double percentualAumento){
        this.percentualAumento = percentualAumento;
    }
    // ---------- Novo Salário -----------
    public Double getNovoSalario(){
        return this.novoSalario;
    }

    public void setNovoSalario(Double novoSalario){
        this.novoSalario = novoSalario;
    }


    // ---- Método para calcular o reajuste ------
    public double calcularReajuste(double salarioMinimo, double percentualAumento) {
        double aumento = this.salario * (percentualAumento / 100);
        double novoSalario = this.salario + aumento;
        return novoSalario;
    }

    // ----- Método para calcular o Aumento na folha ------
    public double calcularAumentoFolha(double novoSalario) {
        double aumentoFolha = novoSalario - this.salario;
        return aumentoFolha;
    }
}  