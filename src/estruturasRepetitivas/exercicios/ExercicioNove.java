package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        /* 9. Ler um número inteiro N e calcular todos os seus divisores. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
