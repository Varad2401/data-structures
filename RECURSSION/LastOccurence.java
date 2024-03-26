public class LastOccurence { 
    public static int lastOccurence(int arr[], int Key, int i){
        if(i == arr.length){
            return -1;
        } 
        
        int isFound = lastOccurence(arr, Key, i+1);
        if(isFound == -1 && arr[i] == Key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5};
        System.out.println(lastOccurence(arr, 5, 0));

    }
}
