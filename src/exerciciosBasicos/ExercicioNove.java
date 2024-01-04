package exerciciosBasicos;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        /* Faça um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule
        * e mostre:
        * a) A área do triângulo retângulo que tem A por base e C por altura.
        * b) A área do círculo de rádio C (Pi = 3.14159).
        * c) A área do trapézio que tem A e B por bases e C por altura.
        * d) A área do quadrado que tem lado B.
        * e) A área do retângulo que tem lados A e B. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Por favor, digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Por favor, digite o valor de C: ");
        double c = sc.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = Math.PI * c * c;
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("Triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Círculo: %.3f%n", areaCirculo);
        System.out.printf("Trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retângulo: %.3f%n", areaRetangulo);

        sc.close();
    }
}
