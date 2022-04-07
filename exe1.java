
/**
 * Faça um algoritmo que receba dois números e ao final
 * mostre o resultado da soma dos dois números lidos.
 */

import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        int num1;
        int num2;
        int soma;
        int total;

        System.out.println("Digite o primeiro número: ");
        num1 = num.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = num.nextInt();

        soma = num1 + num2;

        System.out.println("A soma dos dois números escolhidos é: " + soma);
    }
}
