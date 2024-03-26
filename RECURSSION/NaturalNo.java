public class NaturalNo {
    public static int NatNumber(int n){
        if(n == 1){
            return 1;
        }
        
        
        int Snm1 = NatNumber(n-1);
        int fn = n + Snm1;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(NatNumber(n));
    }
}
