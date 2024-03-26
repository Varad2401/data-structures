import java.util.*;

public class Queuereverse {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Push all elements from queue to stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Pop all elements from stack and add to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        // Print reversed queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
