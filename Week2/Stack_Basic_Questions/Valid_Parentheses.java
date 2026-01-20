package Stack_Basic_Questions;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(validParentheses(s));
    }
    public static boolean validParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty() || !isValid(st.peek(), s.charAt(i))) {
                    return false;
                }
                st.pop();
            }
        }
        return true;
    }
    public static boolean isValid(char o, char c) {
        return (o == '(' && c == ')') || (o == '{' && c == '}') || (o == '[' && c == ']');
    }
}
