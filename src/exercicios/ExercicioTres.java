package exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /* Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal,
        * bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o
        * valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, conforme
        * exemplo.
        * Exemplo:
        * ENTRADA: 10.0 - 30.0 - 200.00
        * SAÍDA: ÁREA = 300.00
        * PREÇO = 60000.00 */
        Scanner sc = new Scanner(System.in);

        // Recebe informações:
        System.out.println("Por favor, digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Por favor, digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Por favor, digite o valor do metro quadrado: ");
        double valorMetroQuadrado = sc.nextDouble();

        // Calcula a área do terreno:
        double areaTerreno = largura * comprimento;

        // Calcula o preço do terreno:
        double precoTerreno = areaTerreno * valorMetroQuadrado;

        // Mostra resultados:
        System.out.printf("Área do terreno = %.2f%n", areaTerreno);
        System.out.printf("Preço do terreno = %.2f%n", precoTerreno);

        sc.close();
    }
}
