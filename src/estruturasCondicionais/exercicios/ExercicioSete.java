package estruturasCondicionais.exercicios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        /* 7. Leia 2 valor com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
        * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos
        * ou na origem (x = y = 0).
        * Se o ponto estiver na origem, escreva a mensagem "Origem".
        * Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme a situação. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada X: ");
        double x = sc.nextDouble();
        System.out.println("Digite a coordenada Y: ");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrante 1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrante 2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrante 3");
        } else {
            System.out.println("Quadrante 4");
        }

        sc.close();
    }
}
