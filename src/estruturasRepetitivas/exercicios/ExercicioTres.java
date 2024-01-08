package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /* 3. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1. Álcool,
         * 2. Gasolina, 3. Diesel, 4. Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
         * solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for
         * o número 4. Deve ser escrito a mensagem "Muito obrigado" e a quantidade que abasteceram cada tipo de
         * combustível, conforme exemplo. */
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Escolha um dos códigos a seguir:
                1 - Álcool
                2 - Gasolina
                3 - Diesel
                4 - Fim/Sair""");
        int codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                System.out.println("Álcool: " + codigo);
            } else if (codigo == 2) {
                System.out.println("Gasolina: " + codigo);
            } else if (codigo == 3) {
                System.out.println("Diesel: " + codigo);
            } else {
                System.out.println("Muito obrigado(a).");
            }
            System.out.println("""
                    Escolha um dos códigos a seguir:
                    1 - Álcool
                    2 - Gasolina
                    3 - Diesel
                    4 - Fim/Sair""");
            codigo = sc.nextInt();
        }
    }
}
