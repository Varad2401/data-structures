public class primeinrange {
    public static void PrimeinRange(int n){
       for(int i=2; i<=n; i++){
          if(isPrime(i)){
           System.out.println(i+"");  
        }
       }
    }
    private static boolean isPrime(int i) {
        return false;
    }
    public static void main(String[] args) {
        PrimeinRange(20);
    }
}
