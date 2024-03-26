public class Vetor {
    public int contador(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        return contador;
    }

   
}
