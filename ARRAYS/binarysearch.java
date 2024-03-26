public class binarysearch {
    public static int BinarySearch(int numbers[],int Key){
       int start = 0, end = numbers.length-1;

       while(start <= end){
          int mid = (start + end) / 2;

          //comparision
          if(numbers[mid] == Key){  //found
            return mid;
          }
          if(numbers[mid] < Key){  //right
            start =mid + 1;
          }
          else {  //left
            end = mid - 1;             
          }
       }
       return -1;
    }
    public static void main(String[] args) {
      int numbers[] = {2, 4, 6, 8, 10, 12, 14};
      int Key = 10;  

      System.out.println("index for key is: " +BinarySearch(numbers,Key));
    }
}
