import java.util.*;

public class Dequexp {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        
        // Print the contents of the deque
        System.out.println(deque);
    }
}
