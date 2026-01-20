import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = nextGreaterElements(nums);
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[st.peek()] < nums[i]) {
                ans[st.pop()] = nums[i];
            }
            st.push(i);
        }
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[st.peek()] < nums[i]) {
                ans[st.pop()] = nums[i];
            }
        }
        while(!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        return ans;
    }
}