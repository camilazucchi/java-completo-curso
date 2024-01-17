package vetores;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /* 3. Fazer um programa para ler NOME, IDADE e ALTURA de N pessoas. Depois, mostrar na tela a altura média das
        * pessoas e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas,
        * caso houver. */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Quantas pessoas serão cadastradas no sistema? ");
        int n = userInput.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        int menores = 0;
        double alturaTotal = 0, alturaMedia, percentualMenores;

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome: ");
            nomes[i] = userInput.next();
            System.out.println("Insira a idade: ");
            idades[i] = userInput.nextInt();
            System.out.println("Insira a altura: ");
            alturas[i] = userInput.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menores++;
            }

            alturaTotal = alturaTotal + alturas[i];
        }

        alturaMedia = alturaTotal / n;
        percentualMenores = ((double) menores / n) * 100.0;

        System.out.println("Altura média: " + alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }


        userInput.close();

    }
}
