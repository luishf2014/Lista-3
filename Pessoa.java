// EXERCICIO 11
public class Pessoa {
    private String nome;
    private char sexo; // 'M' para masculino e 'F' para feminino

    // Construtor da classe Pessoa
    public Pessoa(String nome, int i) {
        this.nome = nome;
        this.sexo = (char) i;
    }

    // Método para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para obter o sexo da pessoa
    public char getSexo() {
        return sexo;
    }
}
