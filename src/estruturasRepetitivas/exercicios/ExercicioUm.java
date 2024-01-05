package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* 1. Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        * incorreta informada, escrever a mensagem "Senha inválida". Quando a senha for informada corretamente deve ser
        * impressa a mensagem "Acesso permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 2002) {
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
            System.out.println("Senha inválida. :(");
        }

        System.out.println("Acesso permitido! :)");

        sc.close();
    }
}
