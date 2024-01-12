package membrosEstaticos.application;

import membrosEstaticos.util.ConversorTemperatura;

import java.util.Scanner;

public class ConversorTemperaturaMain {
    public static void main(String[] args) {
        /* Crie uma classe "ConversorTemperatura" com métodos estáticos para converter temperatura de Celsius para
        * Fahrenheit e vice-versa. Utilize fórmulas de conversão. */

        Scanner sc = new Scanner(System.in);
        double resultado;

        System.out.println("""
                Escolha uma das opções abaixo:
                1 - Converter Celsius para Fahrenheit
                2 - Converter Fahrenheit para Celsius""");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite a temperatura em Celsius: ");
                double temperaturaCelsius = sc.nextDouble();
                resultado = ConversorTemperatura.converteCelsiusFahrenheit(temperaturaCelsius);
                System.out.printf("Após conversão de temperatura: %.1f °F", resultado);
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit: ");
                double temperaturaFahrenheit = sc.nextDouble();
                resultado = ConversorTemperatura.converteFahrenheitCelsius(temperaturaFahrenheit);
                System.out.printf("Após conversão de temperatura: %.1f °C", resultado);
                break;
            default:
                System.out.println("Não foi possível realizar a conversão.");
        }

        sc.close();

    }
}
