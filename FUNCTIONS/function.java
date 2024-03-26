import java.util.*;
public class function{   
    public static void printHelloWorld(){    //here we write a function
        System.out.println("Hello World!");
    }

    public static void calculateSum(int a,int b){
        
        int sum = a + b;
        System.out.println("Sum is:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
       calculateSum(a,b);
    }
}