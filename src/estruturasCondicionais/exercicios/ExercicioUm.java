package estruturasCondicionais.exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* 1. Fazer um programa para ler um número inteiro e depois dizer se este número é negativo ou não. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Não negativo.");
        }

        sc.close();
    }
}
