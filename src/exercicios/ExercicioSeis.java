package exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        /* Faça um programa para ler quatro valores inteiros: A, B, C e D. A seguir, calcule e mostre a diferença
        * do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D). */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        int d = sc.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("Diferença = " + diferenca);

        sc.close();
    }
}
