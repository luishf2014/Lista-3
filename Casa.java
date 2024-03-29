// EXERCICIO 22
public class Casa {
    private Double consumo;

    public Casa(){

    }

    public Casa(Double consumo){
        this.consumo = consumo;
    }
    
    public Double getConsumo(){
        return this.consumo;
    }

    public void setConsumo(Double consumo){
        this.consumo = consumo;
    }

    public double energia(Double consumo, int tipoCliente){
        double valorKwh;
        switch (tipoCliente) {
            case 1:
                valorKwh = 0.60; // Valor do kWh para cliente residencial
                break;
            case 2:
                valorKwh = 0.48; // Valor do kWh para cliente comercial
                break;
            case 3:
                valorKwh = 1.29; // Valor do kWh para cliente industrial
                break;
            default:
                valorKwh = 0.0; // Valor padrão caso o tipo de cliente seja inválido
        }
        return valorKwh;
    }
} 
