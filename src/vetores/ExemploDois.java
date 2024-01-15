package vetores;

import vetores.entities.Product;

import java.util.Scanner;

public class ExemploDois {
    /* Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos em
    * um vetor. Em seguida, mostre o preço médio dos produtos. */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Vetor de "Product" com "n" elementos:
        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the name of the product: ");
            String name = sc.nextLine();
            System.out.println("Enter the price of the product: ");
            double price = sc.nextDouble();
            // Instância do Product:
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average price of the products: %.2f%n", avg);

        sc.close();

    }
}
