package PRACTICALS;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = scanner.nextInt();

        System.out.println("Input number:");
        System.out.println(n);

        System.out.println("The first " + n + " natural numbers are:");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("The Sum of Natural Numbers up to " + n + " terms: " + sum);
    }
}
