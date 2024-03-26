import java.util.*;

class Solution{
    int real;
    int imag;

    public Solution(int r, int i){
        real = r;
        imag = i;
    }

    public static Solution add(Solution a, Solution b){
       return new Solution((a.real+b.real),(a.imag+b.imag));
    }

    public static Solution diff(Solution a, Solution b){
        return new Solution((a.real+b.real),(a.imag+b.imag));
    }

    public static Solution product(Solution a, Solution b){
        return new Solution((a.real*b.real)-(a.imag*b.imag),(a.real*b.imag)+(a.imag*b.real));
    }

    public void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag+"i");
        }

        else if(imag == 0 && real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }

    class Solution{
        public static void main(String args[]){
            Solution c =  new Solution(4,5);
            Solution d = new Solution(9,4);

            Solution e = Solution.add(c,d);
            Solution f = Solution.diff(c,d);
            Solution g = Solution.product(c,d);
            e.printComplex();
            f.printComplex();
            g.printComplex();
        }
    }
    }
}
    

