import java.util.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Zigzag {
    Node head;

    public void zigZag() {
        if (head == null || head.next == null)
            return;

        // Find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse the second half of the list
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Merge the two halves in zigzag manner
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Zigzag zigzag = new Zigzag();
        zigzag.head = new Node(1);
        zigzag.head.next = new Node(2);
        zigzag.head.next.next = new Node(3);
        zigzag.head.next.next.next = new Node(4);
        zigzag.head.next.next.next.next = new Node(5);

        zigzag.print();
        zigzag.zigZag();
        zigzag.print();
    }
}
