package Stack_Medium_Hard_Questions;

import java.util.Scanner;
import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = asteroidCollision(arr);
        for(int a: ans) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static int[] asteroidCollision(int[] asteroid) {
        int n = asteroid.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            boolean flag = false;
            while(!st.isEmpty() && st.peek() > 0 && asteroid[i] < 0) {
                if(st.peek() == Math.abs(asteroid[i])) {
                    flag = true;
                    st.pop();
                    break;
                }
                else if(st.peek() > Math.abs(asteroid[i])) {
                    flag = true;
                    break;
                }
                st.pop();
            }
            if(!flag) {
                st.push(asteroid[i]);
            }
        }
        int size = st.size();
        int[] ans = new int[size];
        while(!st.isEmpty()) {
            ans[--size] = st.pop();
        }
        return ans;
    }
}
