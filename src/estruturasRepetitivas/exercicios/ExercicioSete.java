package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        /* 7. Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro
        * pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisão impossível". */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o valor de N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Por favor, digite o valor de X: ");
            int x = sc.nextInt();
            System.out.println("Por favor, digite o valor de Y: ");
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível.");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}
