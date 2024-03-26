public class leomatricque {
    public static int countOccurences(String input, String pattern){
        int count = 0;
        int index = input.indexOf(pattern);
        while (index != -1) {
            count++;
            index = input.indexOf(pattern, index + 1);
        }
        return count;
    }

    public static void main(String args[]){
        String input = "aaabaabaab";
        String pattern = "b";
        int count = countOccurences(input,pattern);
        System.out.println("Total occurence is: "+count);
    }
}