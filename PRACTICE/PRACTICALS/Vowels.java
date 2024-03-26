package PRACTICALS;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char character = input.charAt(0);

            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                if (isVowel(character)) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Not a letter.");
            }
        } else {
            System.out.println("Error: Input is not a single character.");
        }
    }

    public static boolean isVowel(char c) {
        char lowerCase = Character.toLowerCase(c);
        return lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u';
    }
}
