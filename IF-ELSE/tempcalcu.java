import java.util.*;
public class tempcalcu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature: ");
        double temp = sc.nextDouble();

        if (temp > 100){
            System.out.println("You hava a fever");
        }
        else{
            System.out.println("You don't hava fever");
        }
    }
}