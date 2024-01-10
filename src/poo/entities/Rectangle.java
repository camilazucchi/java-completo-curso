package poo.entities;

public class Rectangle {

    public double width;
    public double height;

    public double calcArea() {
        return width * height;
    }

    public double calcPerimeter() {
        return (width + height) * 2;
    }

    public double calcDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public String toString() {
        return "Area: " +
                String.format("%.2f", calcArea()) +
                " Perimeter: " +
                String.format("%.2f", calcPerimeter()) +
                " Diagonal: " +
                String.format("%.2f", calcDiagonal());
    }
}
