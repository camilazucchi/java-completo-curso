package vetores;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        /* 10. Jogo de Palavras
        * Crie um programa que permita aos usuários jogarem um jogo de palavras. */

        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.println("Quantas palavras você deseja inserir no programa? ");
        n = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Você irá inserir " + n + " palavras no programa. ");
        String[] vect = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Insira uma palavra: ");
            vect[i] = userInput.nextLine();
        }

        System.out.print("Ordem inversa: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(vect[i] + " ");

        }

        userInput.close();

    }

}
