package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        /* 13. Elabore um programa que solicita um número ao usuário e, em seguida, imprime a tabuada desse número
        * de 1 a 10 utilizando um loop "for". */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja saber a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }

        sc.close();
    }
}
