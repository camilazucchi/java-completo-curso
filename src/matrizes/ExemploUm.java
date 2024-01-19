package matrizes;

import java.util.Scanner;

public class ExemploUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // Arranjo bidimensional: -n- linhas e -n- colunas.
        int[][] mat = new int[n][n];

        // Percorre linhas:
        for (int i = 0; i < mat.length; i++) {
            // Percorre colunas:
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();

    }
}
