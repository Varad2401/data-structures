import java.util.LinkedList;

public class Linkedlist {
   public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
   }

   public static Node head;
   public static Node tail;

   public void addFirst(int data){
    
    //step1 = create new node
    Node newNode = new Node(data);
    if (head == null) {
        head = tail = newNode;
        return;
    }

    //step2 - newNode next = head
    newNode.next = head; //Link

    //step 3 - head = newNode
    head = newNode;
   }

   public static void main(String[] args) {
    Linkedlist l1 = new Linkedlist();
    l1.addFirst(1);
    l1.addFirst(2);
   }
    
}