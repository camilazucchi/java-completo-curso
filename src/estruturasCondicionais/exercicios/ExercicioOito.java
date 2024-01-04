package estruturasCondicionais.exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        /* Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em sewguida, calcule
        * e mostre o valor que esta pessoa deve pegar de Imposto de Renda. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o valor da sua renda: ");
        double renda = sc.nextDouble();
        double imposto;
        String mensagem = "Valor a pagar de impostos R$ %.2f";

        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.0) * 0.08 ;
            System.out.printf(mensagem, imposto);
        } else if (renda <= 4500.00) {
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf(mensagem, imposto);
        } else {
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf(mensagem, imposto);
        }

        sc.close();
    }
}
