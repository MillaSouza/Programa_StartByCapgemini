/**
 * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
 */
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        
        Scanner litro = new Scanner (System.in);
        Scanner km = new Scanner (System.in);

        float distanciaT, combustivelT, consumo;

        System.out.println("Informe a distância percorrida pelo automóvel: " );
        distanciaT = km.nextFloat();
        System.out.println("Digite o total gasto de combustível utilizado pelo automóvel: ");
        combustivelT = litro.nextFloat();

        consumo = distanciaT / combustivelT;

        System.out.println("O consumo médio utilizado pelo automóvel é de: " + consumo);
    }
    
}
