/* 
import java.util.*;
public class revofarray {
    public static int reverse(int numbers[]){
        int first=0, last = numbers.length-1;

        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        return last;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
*/

import java.util.*;
public class revofarray {

    public static int RevArray(int numbers){
        int first=0, last = length.numbers-1;

        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        return last;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        RevArray(numbers);
        for(int i=0; i<numbers.length
        ;i++){
            System.out.print(numbers[i]," ");
        }

           System.out.println();
    }
}






















