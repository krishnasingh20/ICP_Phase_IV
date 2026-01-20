import java.util.Scanner;
import java.util.Stack;

public class Backspace_String_compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(backspaceCompare(s, t));
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!st.isEmpty() && s.charAt(i) == '#') {
                st.pop();
            }
            else if(s.charAt(i) != '#'){
                st.push(s.charAt(i));
            }
        }
        if(st.isEmpty()) {
            s = "";
        }
        else{
            StringBuilder str = new StringBuilder();
            while(!st.isEmpty()) {
                str.append(st.pop());
            }
            str.reverse();
            s =  str.toString();
        }
        Stack<Character> st1 = new Stack<>();
        for(int i = 0; i < t.length(); i++) {
            if(!st1.isEmpty() && t.charAt(i) == '#') {
                st1.pop();
            }else if(t.charAt(i) != '#') {
                st1.push(t.charAt(i));
            }
        }
        if(st1.isEmpty()) {
            t = "";
        }
        else{
            StringBuilder str = new StringBuilder();
            while(!st1.isEmpty()) {
                str.append(st1.pop());
            }
            str.reverse();
            t =  str.toString();
        }
        return s.equals(t);
    }
}
