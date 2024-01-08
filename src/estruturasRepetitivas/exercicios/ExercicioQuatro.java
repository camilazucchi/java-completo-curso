package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        /* 4. Leia um valor inteiro x (1 <= x <= 1000). Em seguida mostre os ímpares de 1 até x, um valor por linha,
        * inclusive o x, se for o caso. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira um número: ");

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            // Se o resto da divisão por 2 for diferente de 0 (verdadeiro apenas para números ímpares).
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
