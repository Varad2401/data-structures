import java.util.Scanner;

public class sumofdigit {
    public static int sumofDigit(int n){
        int sumofDigit = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sumofDigit += lastDigit;
            n /= 10;
        }
        return sumofDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumofDigit(digits));
        }
    }

