import java.util.*;
public class LinearSearch {
    public static int LinearSearch(int numbers[],int Key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == Key){
                return i;
            }
        }
        return -1;    //if meaning is our key is not exist 
    }
    public static void main(String[] args) {
      int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
      int Key = 10;
      
      int index = LinearSearch(numbers, Key);
      if(index == -1){
         System.out.println("NOT FOUND");
      }else{
        System.out.println("Key is at index: "+ index); 
      }
      
    }
}













