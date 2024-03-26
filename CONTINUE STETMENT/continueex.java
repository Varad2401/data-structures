import java.util.*;
public class continueex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a no:");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was: " +n);
        } while(true);

    }
}