import java.util.*;
public class pairsinarray {
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; //2, 4, 6, 8, 10
            for(int k=i+1; k<numbers.length; k++){
                System.out.println("(" +curr + "," +numbers[k] +") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Numbers of Pairs is: "+tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
