package poo.application;

import poo.entities.Rectangle;

import java.util.Scanner;

public class MainExercicioUm {
    public static void main(String[] args) {
        /* Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o
        * valor de sua área, perímetro e diagonal. */
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Please enter the rectangle width: ");
        rectangle.width = sc.nextDouble();
        System.out.println("Please enter the rectangle height: ");
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
