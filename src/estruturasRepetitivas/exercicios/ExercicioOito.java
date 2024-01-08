package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        /* 8. Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) *
        * ... * 1. Lembrando que, por definição, fatorial de 0 é 1. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= n; i ++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
