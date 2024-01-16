package vetores;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        /* 2. Faça um programa que leia n números reais e armazene-os em um vetor. Em seguida:
        * - Imprimir todos os elementos do vetor.
        * - Mostrar na tela a soma e a média dos elementos do vetor. */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar?");
        int n = userInput.nextInt();
        double[] vect = new double[n];
        double sum, media;

        // Loop que percorre o vetor e adiciona os números inseridos no mesmo:
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = userInput.nextDouble();
        }

        System.out.print("Valores: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        sum = 0;

        for (int i = 0; i < n; i++) {
            // Soma dos valores do vetor:
            sum += vect[i];
        }

        System.out.printf("\nSoma: %.2f\n", sum);

        media = sum / n;

        System.out.printf("Média: %.2f\n", media);

        System.out.println("Finalizando programa...");

        userInput.close();

    }
}
