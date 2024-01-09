package estruturasRepetitivas.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        /* 16. Gere aleatoriamente um número entre 1 e 100. Peça ao usuário para adivinhar o número e continue
        * pedindo até que o usuário acerte. */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(100) + 1;
        int numero, tentativas = 0;

        do {
            System.out.println("Adivinhe o número (entre 1 e 100): ");
            numero = sc.nextInt();
            tentativas++;

            if (numero < aleatorio) {
                System.out.println("Tente um número maior!");
            } else if (numero > aleatorio) {
                System.out.println("Tente um número menor!");
            }
        } while (numero != aleatorio);

        System.out.println("Parabéns! Você acertou em " + tentativas +" tentativas.");

        sc.close();
    }
}
