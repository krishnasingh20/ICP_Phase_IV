import java.util.Scanner;
import java.util.Stack;

public class Daily_temperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temperatures = new int[n];
        for(int i = 0; i < n; i++) {
            temperatures[i] = sc.nextInt();
        }
        int[] ans = dailyTemperatures(temperatures);
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                ans[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
