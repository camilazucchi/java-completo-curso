package estruturasRepetitivas.exemplos;

import java.util.Scanner;

public class ExemploDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Quantas vezes queremos repetir:
        int n = sc.nextInt();
        int soma = 0;

        // Repete enquanto i for menor do que n:
        // i = i + 1 -> i++;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();
    }
}
