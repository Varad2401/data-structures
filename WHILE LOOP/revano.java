public class revano {
    public static void main(String[] args) {
        int n = 240501;

        while ( n > 0){
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
        System.out.println();
    }
}
