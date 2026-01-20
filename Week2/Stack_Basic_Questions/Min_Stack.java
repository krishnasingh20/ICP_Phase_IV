package Stack_Basic_Questions;

import java.util.Scanner;
import java.util.Stack;

public class Min_Stack {
    static class MinStack {
        Stack<int[]> st;
        public MinStack() {
            st = new Stack<>();
        }
        public void push(int val) {
            int[] a = new int[2];
            a[0] = val;
            a[1] = val;
            if(!st.isEmpty()) {
                a[1] = Math.min(val, st.peek()[1]);
            }
            st.push(a);
        }
        public void pop() {
            st.pop();
        }
        public int top() {
            return st.peek()[0];
        }
        public int getMin() {
            return st.peek()[1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack minstack = new MinStack();
        int call = sc.nextInt();
        while(call-- > 0) {
            String type = sc.next();
            if (type.equals("push")) {
                 int val = sc.nextInt();
                 minstack.push(val);
            }
            else if (type.equals("pop")) {
                 minstack.pop();
            }
            else if (type.equals("top")) {
                 int top = minstack.top();
                 System.out.println("top--> " + top);
            }
            else {
                int min = minstack.getMin();
                System.out.println("Min get--> "+min);
            }
         }
    }
}
