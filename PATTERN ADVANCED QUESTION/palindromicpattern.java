/* 
public class palindromicpattern {
    public static void Palindromic_Pattern(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            //desending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //assending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Palindromic_Pattern(5);
    }
}

*/
public class palindromicpattern{
    public static void Palindromic_Pattern(int n){
        //outer loop
        for(int i=1; i<=5; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //desending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //assending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Palindromic_Pattern(5);
    }
}

























