package vetores;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        /* 8. Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem
         * ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais
         * velha. */

        Scanner userInput = new Scanner(System.in);
        int n;

        // Recebe o tamanho do vetor:
        System.out.println("Quantas pessoas você deseja cadastrar no programa? ");
        n = userInput.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        // Percorre e "popula" os vetores:
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da pessoa número: " + (i + 1));
            System.out.println("Digite o nome: ");
            names[i] = userInput.next();
            System.out.println("Digite a idade: ");
            ages[i] = userInput.nextInt();
        }

        int highestAge = Integer.MIN_VALUE;
        int indexOfOldestPerson = -1;

        for (int i = 0; i < n; i++) {
            if (ages[i] > highestAge) {
                highestAge = ages[i];
                indexOfOldestPerson = i;
            }
        }

        System.out.println("A pessoa mais velha cadastrada no programa é: " + names[indexOfOldestPerson] + ". Sua idade " + "é: " + highestAge + " anos.");


        userInput.close();

    }
}
