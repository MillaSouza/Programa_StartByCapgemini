/**
 * Faça um algoritmo para informar ao João se ele foi aprovado na matéria de Lógica de programação. João fez 3 provas e média necessária para ser aprovado é 7.
 */
import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {
     
        Scanner nota = new Scanner (System.in);

        int prova1, prova2, prova3, media;

        System.out.println("Matéria: Lógica de Programação");
        System.out.println("Aluno: João\n");

        System.out.println("Digite a nota da primeira prova: ");
        prova1 = nota.nextInt();
        System.out.println("Digite a nota da segunda prova: ");
        prova2 = nota.nextInt();
        System.out.println("Digite a nota da terceira prova: ");
        prova3 = nota.nextInt();

        media = (prova1 + prova2 + prova3) / 3;

        System.out.println("A média do aluno é: \n" + media);

        if(media >= 7){
            System.out.println("Aluno aprovado!\n");
        } else {
            System.out.println("Aluno em recuperação!\n");
        }
    }
    
}
