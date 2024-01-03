package exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        /* Faça um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser
        * pago. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Funcionário, digite o código da peça 1: ");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Funcionário, digite o números de peças 1: ");
        int numeroPecas1 = sc.nextInt();
        System.out.println("Funcionário, digite o valor unitário da peça 1: ");
        double valorPeca1 = sc.nextDouble();
        System.out.println("Funcionário, digite o código da peça 2: ");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Funcionário, digite o números de peças 2: ");
        int numeroPecas2 = sc.nextInt();
        System.out.println("Funcionário, digite o valor unitário da peça 2: ");
        double valorPeca2 = sc.nextDouble();

        double valorTotal = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);

        System.out.printf("Valor para pagamento: R$ %.2f", valorTotal);

    }
}
