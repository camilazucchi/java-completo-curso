package estruturasRepetitivas.exemplos;

import java.util.Scanner;

public class ExemploQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resposta;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.println("""
                    Deseja repetir?
                    S - Sim
                    N - Não""");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');
        System.out.println("Encerrando calculadora...");

        sc.close();
    }
}
