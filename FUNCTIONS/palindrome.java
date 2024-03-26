import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while(palindrome != 0){   // "!" is sign of factoral
             int remainder = palindrome % 10;
             reverse = reverse * 10 + remainder;
             palindrome = palindrome / 10;
        }

        if (number == reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : "+ palindrome +" is a palindrome");

        }
        else{
            System.out.println("Number : " + palindrome + "is not a palindrome");
        }
    }
}
