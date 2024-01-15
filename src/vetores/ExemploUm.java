package vetores;

import java.util.Scanner;
import java.util.Vector;

public class ExemploUm {
    /* Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em
    * seguida, mostrar a altura média dessas pessoas. */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the total number of heights you wish to calculate the average: ");

        // Tamanho do vetor:
        int n = sc.nextInt();

        // Declarando um vetor:
        double[] vect = new double[n];

        // For para acessar posições do vetor:
        for (int i = 0; i < n; i++) {
            System.out.println("Kindly enter the height: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("The average height is: %.2f", avg);

        sc.close();

    }
}
