package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        /* 10. Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
        * conforme exemplo.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", i, segundo, terceiro);
        }

        sc.close();
    }
}
