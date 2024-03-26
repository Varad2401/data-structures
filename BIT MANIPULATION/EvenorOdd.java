public class EvenorOdd {
    public static void EvenorOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        } else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        EvenorOdd(3);
        EvenorOdd(10);
        EvenorOdd(14);

    }
}
