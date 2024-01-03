package exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        /* Faça um programa para ler o valor do raio de um círculo e depois mostrar o valor da área deste círculo com
        * quatro casas decimais. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}
