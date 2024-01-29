package abstractMethods.application;

import abstractMethods.entities.Circle;
import abstractMethods.entities.Rectangle;
import abstractMethods.entities.Shape;
import abstractMethods.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Podemos criar variáveis ou coleções de um tipo abstrato:
        List<Shape> shapeList = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            // A palavra que o usuário digitar será convertida para o objeto do tipo ENUM "Color":
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapeList) {
            // Polimorfismo "shape.area()":
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();

    }
}
