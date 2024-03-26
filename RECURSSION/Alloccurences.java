public class Alloccurences {
    public static void allOccurences(int arr[],int Key, int i){
       if(i == arr.length){
        return;
       }
       if(arr[i] == Key){
        System.out.println(i+" ");
       } 
       allOccurences(arr,Key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int Key = 2;
        allOccurences(arr,Key,0);
        System.out.println();
    }
}
