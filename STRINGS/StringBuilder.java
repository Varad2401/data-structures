import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder( );
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public void append(char ch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'append'");
    }
}
