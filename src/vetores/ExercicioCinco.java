package vetores;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        /* 5. Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostre na tela o maior
        * número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a
        * primeira posição como 0 (zero). */

        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.println("Quantos números serão inseridos no programa? ");
        n = userInput.nextInt();
        double[] vect = new double[n];
        double maiorValor = vect[0];
        int posicaoMaiorValor = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = userInput.nextDouble();
        }

        for (int i = 1; i < n; i++) {
            if (vect[i] > maiorValor) {
                maiorValor = vect[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.printf("Maior valor: %.1f%n", maiorValor);
        System.out.println("Posição do maior valor: " + posicaoMaiorValor);





        userInput.close();

    }
}
