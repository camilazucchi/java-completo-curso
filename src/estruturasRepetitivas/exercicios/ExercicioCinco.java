package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        /* 5. Leia um valor inteiro N. Este valor será a quantidade de valores inteiros x que serão lidos em seguida.
        * Mostre quantos destes valores x estão dentro do intervalo [10,20] e quantos estão fora do intervadlo,
        * mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo e "out" para fora
        * do intervalo. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite a quantidade de números que você deseja inserir: ");
        // Quantidade de valores inteiros x que serão lidos:
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Por favor, digite um número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
