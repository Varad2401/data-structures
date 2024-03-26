import java.util.Scanner;

public class evenorodd {

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(isEven(num)){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }
}
