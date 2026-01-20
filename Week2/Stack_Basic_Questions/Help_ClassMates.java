package Stack_Basic_Questions;

import java.util.Scanner;
import java.util.Stack;

public class Help_ClassMates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] ans = help_classmate(nums1, n);
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        return ans;
    }
}
