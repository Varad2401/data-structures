import java.util.Scanner;

public class largof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a 3 Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c){
            System.out.println("A is gratest");
        }
        else if(b >= a && b >= c){
            System.out.println("B is gratest");
        }
        else if(c >= a && c >= b){
            System.out.println("C is gratest"); 
        }
    }
}
