// EXERCICIO 11
public class ContadorGenero {
    private int totalHomens;
    private int totalMulheres;
    
    // Construtor da classe ContadorGenero
    public ContadorGenero() {
        totalHomens = 0;
        totalMulheres = 0;
    }

    // Método para obter o total de homens
    public int getTotalHomens() {
        return totalHomens;
    }

    // Método para obter o total de mulheres
    public int getTotalMulheres() {
        return totalMulheres;
    }
    
    // Método para contar o número de homens e mulheres com base em uma pessoa
    public void contarPessoa(Pessoa pessoa) {
        if (pessoa.getSexo() == 'M') {
            totalHomens++;
        } else if (pessoa.getSexo() == 'F') {
            totalMulheres++;
        }
    }
}
