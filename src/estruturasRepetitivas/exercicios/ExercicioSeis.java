package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        /* 6. Leia um valor inteiro N que representa o número de casos de teste que vem a seguir. Cada caso de teste
        * consiste de três valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um
        * destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro
        * valor tem peso 5. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o valor de N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Por favor, insira o valor de A: ");
            double a = sc.nextDouble();
            System.out.println("Por favor, insira o valor de B: ");
            double b = sc.nextDouble();
            System.out.println("Por favor, insira o valor de C: ");
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
