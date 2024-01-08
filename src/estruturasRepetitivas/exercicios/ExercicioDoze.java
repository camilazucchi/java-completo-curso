package estruturasRepetitivas.exercicios;

public class ExercicioDoze {
    public static void main(String[] args) {
        /* 12. Crie um programa que calcula e imprime a soma dos números pares de 1 a 50 usando um loop "for". */
        int soma = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de 1 a 50 é: " + soma);
    }
}
