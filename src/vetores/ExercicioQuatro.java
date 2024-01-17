package vetores;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        /* 4. Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro
        * vetor C onde cada elemento de C é a soma dos elementos correspondentes A e B. Imprima o vetor C gerado. */

        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.println("Digite quantos elementos terá cada vetor: ");
        n = userInput.nextInt();
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor A: ");
            vectorA[i] = userInput.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor B: ");
            vectorB[i] = userInput.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vectorC[i]);
        }

        userInput.close();

    }
}
