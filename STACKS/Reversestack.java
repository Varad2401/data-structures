import java.util.*;
public class Reversestack {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if (s.empty()) {
            return;
        } 
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    
    public static void printStack(Stack<Integer> s){
        while (!s.empty())
        System.out.print(s.pop()); 
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //printStack(s); 
        reverseStack(s);
        printStack(s);
    }
}
