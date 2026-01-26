package Stack_Medium_Hard_Questions;

import java.util.*;

public class Longest_Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int ans = 0;
        int n = s.length();
        char[] ch = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        st.push(-1);//initial valid boundary started after these
        for(int i = 0; i < n; i++) {
            if(ch[i] == '(') {
                st.push(i);
            }
            else {
                st.pop();
                if(st.isEmpty()) {
                    st.push(i);//new boundary will start after these index
                }
                else {
                    ans = Math.max(ans, i - st.peek());
                }
            }
        }
        return ans;
    }
}
