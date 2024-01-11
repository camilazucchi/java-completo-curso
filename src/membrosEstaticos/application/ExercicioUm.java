package membrosEstaticos.application;

import membrosEstaticos.util.CurrencyConverter;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em
        * reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar
        * 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos. */

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(quantity, price);
        System.out.printf("Amount to be paid in reais = %.2f", result);

        sc.close();
    }
}
