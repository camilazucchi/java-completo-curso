package vetores;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        /* 9. Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no
        * primeiro e segundo semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a
        * 6.0. */

        Scanner userInput = new Scanner(System.in);
        int n;

        System.out.println("Quantos alunos serão inseridos no programa? ");
        n = userInput.nextInt();

        String[] names = new String[n];
        double[] grades1 = new double[n];
        double[] grades2 = new double[n];
        double media;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do aluno: " + (i + 1));
            // Limpa o buffer de entrada e evita o erro "InputMismatchException".
            userInput.nextLine();
            names[i] = userInput.nextLine();
            System.out.println("Digite a primeira nota do aluno: " + (i + 1));
            grades1[i] = userInput.nextDouble();
            System.out.println("Digite a segunda nota do aluno: " + (i + 1));
            grades2[i] = userInput.nextDouble();
        }

        System.out.println("Alunos aprovados (com média igual ou acima de 6.0): ");
        for (int i = 0; i < n; i++) {
            media = (grades1[i] + grades2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("%s%n", names[i]);
            }

        }

        userInput.close();

    }
}
