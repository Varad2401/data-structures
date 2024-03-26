import java.util.*;

public class ArrayEx{

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {

        int marks[] = {97, 98, 99};
        update(marks);
        
        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+ " ");
        }
        /* 
        int marks[] = new int[50];
        
        int numbers[] = {1, 2, 3};

        int moreNumbers[] = {4, 5, 6};

        String fruits[]= {"apple", "mango", "orange"}; 

        */
    }
}