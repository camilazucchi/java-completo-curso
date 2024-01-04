package estruturasCondicionais.exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /* 3. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São múltiplos" ou "Não são
        * múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser
        * digitados em ordem crescente ou decrescente. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Por favor, digite o valor de B: ");
        int b = sc.nextInt();

        if ( a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
