// EXERCICIO 20
class Professor {
    private int nivel;
    private double valorHoraAula;

    public Professor(){

    }

    // Construtor
    public Professor(int nivel) {
        this.nivel = nivel;
        definirValorHoraAula();
    }

    // Método para definir o valor da hora/aula com base no nível do professor
    private void definirValorHoraAula() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.0;
                break;
            case 2:
                valorHoraAula = 17.0;
                break;
            case 3:
                valorHoraAula = 25.0;
                break;
            default:
                System.out.println("Nível inválido.");
        }
    }

    // Método para calcular o salário do professor com base no número de horas/aula
    public double calcularSalario(int horasAula) {
        return horasAula * valorHoraAula;
    }
}
