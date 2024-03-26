public class AccendingOrd1toN {
    
  public static void printAcc(int n){
    if(n == 1){
      System.out.print(n+" ");{
          return;
      }
    }
      printAcc(n-1);   
      System.out.print(n+" ");
  }
  
  
  
  public static void main(String args[]){
      int n = 5;
      printAcc(n);
  }
  
}