package PRACTICALS;

import java.util.Scanner;

abstract class shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        // Heron's formula for the area of a triangle
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the shape (Rectangle, Circle, Triangle): ");
        String shapeType = scanner.nextLine();

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(length, width);
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Perimeter: " + circle.calculatePerimeter());
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            System.out.print("Enter side A: ");
            double sideA = scanner.nextDouble();
            System.out.print("Enter side B: ");
            double sideB = scanner.nextDouble();
            System.out.print("Enter side C: ");
            double sideC = scanner.nextDouble();
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            System.out.println("Area: " + triangle.calculateArea());
            System.out.println("Perimeter: " + triangle.calculatePerimeter());
        } else {
            System.out.println("Invalid shape type.");
        }
    }
}
