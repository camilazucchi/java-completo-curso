package matrizes;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* 1. Fazer um programa para ler dois números inteiros: M e N, e depois ler uma matriz de M linhas por N
        * colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence
        * à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando
        * houver. */

        Scanner userInput = new Scanner(System.in);

        System.out.print("Qual o valor de M? ");
        int m = userInput.nextInt();
        System.out.print("Qual o valor de N? ");
        int n = userInput.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            System.out.print("Digite a matriz: ");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = userInput.nextInt();
            }
        }

        System.out.print("Digite o valor de X inserido na matriz: ");
        int x = userInput.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ": ");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (j < n - 1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < m - 1) {
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        userInput.close();

    }
}
