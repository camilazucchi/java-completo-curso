package estruturasRepetitivas.exemplos;

import java.util.Scanner;

public class ExemploUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do primeiro valor:
        int x = sc.nextInt();

        int soma = 0;
        // Enquanto "x" for diferente de "0":
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}
