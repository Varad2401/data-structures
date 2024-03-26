public class Pattern {
    public static void main(String[] args) {
        int n = 4; // Change this value to adjust the size of the pattern
        printPattern(n);
    }
    
    public static void printPattern(int n) {
        for (int i = 0; i <= n; i++) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            
            // Print characters in increasing order
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j));
                if (j < i) {
                    System.out.print(" ");
                }
            }
            
            // Print characters in decreasing order
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
                if (j > 0) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
        for (int i = n - 1; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            
            // Print characters in increasing order
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j));
                if (j < i) {
                    System.out.print(" ");
                }
            }
            
            // Print characters in decreasing order
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
                if (j > 0) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
