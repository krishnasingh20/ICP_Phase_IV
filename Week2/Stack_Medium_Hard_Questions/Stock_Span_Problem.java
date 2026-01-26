package Stack_Medium_Hard_Questions;

import java.util.*;

public class Stock_Span_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = calculateSpan(arr);
        for(int a: ans) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans.add((i+1));
            }
            else {
                ans.add((i-st.peek()));
            }
            st.push(i);
        }
        return ans;
    }
}
