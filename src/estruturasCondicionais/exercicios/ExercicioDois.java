package estruturasCondicionais.exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        /* 2. Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        sc.close();
    }
}
