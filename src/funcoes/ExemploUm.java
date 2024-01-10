package funcoes;

import java.util.Scanner;

public class ExemploUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = findMaxValue(a, b, c);
        displayHigherValue(higher);

        sc.close();
    }

    public static int findMaxValue(int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void displayHigherValue(int value) {
        System.out.println("The higher is: " + value);
    }
}
