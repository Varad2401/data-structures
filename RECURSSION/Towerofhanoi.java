public class Towerofhanoi {
    public static void TowerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk " + n + "from" +src + " tc " +dest);
            return;
        }

        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        TowerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 4;
        TowerOfHanoi(n, "A", "B", "C");
    }
}
