package poo.application;

import poo.entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        // Instância do objeto:
        x = new Triangle();
        y = new Triangle();

        // Solicita medidas do triângulo X:
        System.out.println("Enter the measures of the triangle X: ");
        // O "." acessa os atributos da entidade Triangle:
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        // Solicita medidas do triângulo Y:
        System.out.println("Enter the measures of the triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Chamando o método que calcula a área de um triângulo:
        double areaX = x.area();
        double areaY = y.area();

        // Mostra os dados:
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        // Verifica qual área é a maior:
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();

    }
}
