package tratamentoExcecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();
        System.out.println("Closing program");

    }

    public static void method1() {
        System.out.println("- START OF METHOD 1 -");
        method2();
        System.out.println("- END OF METHOD 1 -");
    }

    public static void method2() {
        System.out.println("- START OF METHOD 2 -");

        Scanner sc = new Scanner(System.in);
        try {
            // Lê vários dados na mesma linha separados por espaço em branco:
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            // Imprime na tela o rastreamento do stack:
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        sc.close();
        System.out.println("- END OF METHOD 2 -");

    }
}
