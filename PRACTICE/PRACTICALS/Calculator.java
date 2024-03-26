package PRACTICALS;

import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root");
            System.out.println("2. Exponentiation");
            System.out.println("3. Sine");
            System.out.println("4. Cosine");
            System.out.println("5. Tangent");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double number = scanner.nextDouble();
                    double squareRoot = Math.sqrt(number);
                    System.out.println("Square root: " + squareRoot);
                    break;
                case 2:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    double result = Math.pow(base, exponent);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter an angle in degrees: ");
                    double angle = scanner.nextDouble();
                    double sine = Math.sin(Math.toRadians(angle));
                    System.out.println("Sine: " + sine);
                    break;
                case 4:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    double cosine = Math.cos(Math.toRadians(angle));
                    System.out.println("Cosine: " + cosine);
                    break;
                case 5:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    double tangent = Math.tan(Math.toRadians(angle));
                    System.out.println("Tangent: " + tangent);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
