package vetores;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* 1. Faça um programa que leia um número inteiro positivo n (máximo = 10) e depois n números inteiros e
        * armazene-os em um vetor. Em seguida, mostre na tela todos os números negativos lidos. */

        Scanner userInput = new Scanner(System.in);

        int n;

        // Verificação que o enunciado pede ("máximo = 10").
        do {
            System.out.println("Digite a quantidade de números que deseja inserir no programa: ");
            n = userInput.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("Por favor, insira um valor entre 1 e 10. ");
            }
        } while (n < 1 || n > 10);


        int[] vect = new int[n];

        // Percorrendo o vetor:
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = userInput.nextInt();
        }

        System.out.println("Aqui estão os números negativos inseridos no programa: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println("- Posição no vetor: " + i + "\n" + "- Número inserido: " + vect[i]);
            }
        }


        userInput.close();

    }
}
