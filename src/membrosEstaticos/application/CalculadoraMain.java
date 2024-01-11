package membrosEstaticos.application;

import membrosEstaticos.util.Calculadora;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        /* Crie uma classe "Calculadora" com métodos estáticos para realizar operações matemáticas básicas, como soma,
         * subtração, multiplicação e divisão. Não é necessário criar instâncias da classe para usar os métodos. */

        Scanner sc = new Scanner(System.in);
        double resultado;

        System.out.println("Digite o valor do primeiro número (a): ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor do segundo número (b): ");
        double b = sc.nextDouble();

        System.out.println("""
                Qual operação deseja realizar?
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão""");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                resultado = Calculadora.realizaSoma(a, b);
                System.out.println("O resultado é: " + resultado);
                break;
            case 2:
                resultado = Calculadora.realizaSubtracao(a, b);
                System.out.println("O resultado é: " + resultado);
                break;
            case 3:
                resultado = Calculadora.realizaMultiplicacao(a, b);
                System.out.println("O resultado é: " + resultado);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Não é possível realizar a divisão por 0.");
                } else {
                    resultado = Calculadora.realizaDivisao(a, b);
                    System.out.println("O resultado é: " + resultado);
                }
                break;
            default:
                System.out.println("Não foi possível realizar a operação.");
        }

        sc.close();
    }
}
