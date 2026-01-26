package Stack_Medium_Hard_Questions;

import java.util.*;

public class Largest_Rectangle_In_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int r = i;
            while(!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int h = heights[st.pop()];
                int w = st.isEmpty()?r:r-st.peek()-1;
                ans = Math.max(ans, w*h);
            }
            st.push(i);
        }
        int r = n;
        while(!st.isEmpty()) {
            int h = heights[st.pop()];
            int w = st.isEmpty()?r:r-st.peek()-1;
            ans = Math.max(ans, w*h);
        }
        return ans;
    }
}
