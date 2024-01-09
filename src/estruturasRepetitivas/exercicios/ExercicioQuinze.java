package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        /* 15. Peça ao usuário para digitar números inteiros positivos e continue somando esses números até que o
        * usuário digite um número negativo. Em seguida, exiba a soma. */
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;

        do {
            System.out.println("Digite um número para soma (caso queira sair, digite um número negativo): ");
            numero = sc.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números positivos é: " + soma);

        sc.close();
    }
}
