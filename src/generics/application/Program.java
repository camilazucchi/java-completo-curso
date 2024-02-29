package generics.application;

import generics.model.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Instância de PrintService:
        PrintService<Integer> printService = new PrintService<>();

        // Pergunta para o usuário quantos valores ele deseja digitar:
        System.out.print("How many values you wish to insert? ");
        // Armazena a quantidade de valores que o usuário deseja digitar:
        int n = scanner.nextInt();

        // Percorre a quantidade de valores e os adiciona na lista PrintService:
        System.out.print("Please enter the values: ");
        for (int i = 0; i < n; i++) {
            Integer value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println(" First: " + printService.first());

        scanner.close();

    }
}
