package Stack_Basic_Questions;

import java.util.Scanner;
import java.util.Stack;

public class Delete_middle_of_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            st.push((sc.nextInt()));
        }
        deleteMid(st);
    }
    public static void deleteMid(Stack<Integer> s) {
        // code here
        int n = s.size();
        int mid = (n+1)/2;
        if((n & 1) == 0) {
            mid++;
        }
        deleteMiddle(s, mid-1);
    }
    public static void deleteMiddle(Stack<Integer> st, int mid) {
        if(mid == 0) {
            st.pop();
            return;
        }
        int rv = st.pop();
        deleteMiddle(st, mid-1);
        st.push(rv);
    }
}
