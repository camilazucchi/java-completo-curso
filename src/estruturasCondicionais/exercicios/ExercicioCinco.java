package estruturasCondicionais.exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        /* 5. Com base na tabela do professor, escreva um programa que leia o código de um item e a quantidade deste
        * item. A seguir, calcule e mostre o valor da conta a pagar. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira o código do primeiro item desejado: ");
        int codigo = sc.nextInt();
        System.out.println("Por favor, insira a quantidade do item desejado: ");
        int quantidade = sc.nextInt();

        double total;

        if (codigo == 1) {
            System.out.println("Alimento: Cachorro-quente\nPreço: R$4.00\nQuantidade escolhida: " + quantidade);
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            System.out.println("Alimento: X-Salada\nPreço: R$4.50\nQuantidade escolhida: " + quantidade);
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            System.out.println("Alimento: X-Bacon\nPreço: R$5.00\nQuantidade escolhida: " + quantidade);
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            System.out.println("Alimento: Torrada simples\nPreço: R$2.00\nQuantidade escolhida: " + quantidade);
            total = quantidade * 2.00;
        } else {
            System.out.println("Bebida: Refrigerante\nPreço: R$1.50\nQuantidade escolhida: " + quantidade);
            total = quantidade * 1.50;
        }

        System.out.printf("Total a pagar: R$ %.2f", total);

        sc.close();
    }
}
