package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        /* Faça um programa para ler dois valores inteiros e depois mostrar na tela a soma desses números com uma
        * mensagem explicativa. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número que deseja somar: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número que deseja somar: ");
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
