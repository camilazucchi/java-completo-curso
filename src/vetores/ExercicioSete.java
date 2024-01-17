package vetores;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        /* 7. Fazer um programa para ler um vetor N de números inteiros. Em seguida, mostrar na tela a média aritmética
        * somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem:
        * "Nenhum número par." */

        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.println("Quantos elementos o vetor terá? ");
        n = userInput.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = userInput.nextInt();
        }

        double sum = 0;
        int countPares = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                sum += vect[i];
                countPares++;
            }
        }

        if (countPares > 0) {
            double media = sum / countPares;
            System.out.printf("Média dos pares: %.1f%n", media);
        } else {
            System.out.println("Nenhum número par!");
        }

        userInput.close();

    }
}
