package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ExercicioDezessete {
    public static void main(String[] args) {
        /* 17. Quiz sobre Java */
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;
        boolean continuar;
        String acerto = "Resposta correta!";

        do {
            System.out.println("""
                    1. Qual é a principal finalidade do Java?
                    (a) Desenvolvimento Web
                    (b) Inteligência Artificial
                    (c) Programação de Sistemas""");
            String resposta1 = scanner.next();

            if (resposta1.equals("c")) {
                System.out.println(acerto);
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta é Programação de Sistemas!");
            }

            System.out.println("""
                    2. O que é um objeto em Java?
                    (a) Uma instância de uma classe
                    (b) Um tipo primitivo
                    (c) Um operador lógico""");
            String resposta2 = scanner.next();

            if (resposta2.equals("a")) {
                System.out.println(acerto);
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta é uma instância de uma classe!");
            }

            System.out.println("""
                    3. O que é o Java Virtual Machine (JVM)?
                    (a) Um compilador Java
                    (b) Um ambiente de execução para código Java
                    (c) Um framework de desenvolvimento web""");
            String resposta3 = scanner.next();

            if (resposta3.equals("b")) {
                System.out.println(acerto);
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta é um ambiente de execução para código Java!");
            }

            System.out.println("Sua pontuação final é: " + pontuacao + "!");
            System.out.println("Deseja jogar novamente? Digite 'sim' para continuar: ");
            String escolha = scanner.next();
            continuar = escolha.equalsIgnoreCase("sim");
        } while (continuar);

        System.out.println("Obrigada por jogar!");
    }
}
