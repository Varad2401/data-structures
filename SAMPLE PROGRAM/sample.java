/* 
 How many times 'Hello' is printed?
import java.util.*;
public class sample{
    public static void main(String[] args) {
        int i;
        for(i=0;i<5;i++){
            System.out.println("Hello");
            i+=2;

        }
    }
}
*/

/* 
Write a program that reads a set of integers, and then prints the sum of the
even and odd integers.

import java.util.*;
public class sample{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("Enter a number");
            number = sc.nextInt();

            if(number % 2 == 0){
              evenSum += number;
            }
            else{
                oddSum += number;
            }

            System.out.println("Do you want to continue? press 1 for yes or 0 for no");
            choice = sc.nextInt();


        } while(choice==1);

        System.out.println("Sum of even numbers:" +evenSum);

        System.out.println("Sum of odd numbers:" +oddSum);
    }
}

*/

/*
 Write a program to find the factorial of any number entered by the user.
 
import java.util.*;
public class sample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number,i;
        int fact = 1;

        System.out.println("Enter a number: ");
        number = sc.nextInt();

        for (i =1;i <= number;i++){
            fact += i;
        }

        System.out.println("Factorial is:" +fact);

    }
}

*/

/* 
Write a program to print the multiplication table of a number N, entered by the
user.

import java.util.*;
public class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number=sc.nextInt();

        for(int i = 1;i <= 10;i++){
            System.out.println(number+" * "+ i +" = " + number * i);

        }


    }


}

*/

public class sample {
    public static void main(String args[]) {
    for(int i = 0; i <= 5; i++ ) {
    System.out.println("i = " + i );
    }
    System.out.println("i after the loop = "  );
}
}



