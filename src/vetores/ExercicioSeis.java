package vetores;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        /* 6. Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar
        * na tela a média aritmética de todos os elementos com três casas decimais. Depois mostrar todos os elementos
        * do vetor que estejam abaixo da média, com uma casa decimal cada. */

        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.println("Quantos elementos terá o vetor? ");
        n = userInput.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = userInput.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double media = sum / n;

        System.out.printf("Média do vetor: %.3f%n", media);
        System.out.println("Elementos abaixo da média: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        userInput.close();

    }
}
