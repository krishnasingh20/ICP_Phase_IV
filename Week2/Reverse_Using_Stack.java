import java.util.Scanner;
import java.util.Stack;

public class Reverse_Using_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()) {
            st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
