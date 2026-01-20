package Stack_Basic_Questions;

import java.util.Scanner;
import java.util.Stack;

public class Baseball_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] opr = new String[n];
        for(int i = 0; i < n; i++) {
            opr[i] = sc.next();
        }
        System.out.println(calPoints(n, opr));
    }
    public static int calPoints(int n, String[] opr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(opr[i].charAt(0) == 'C') {
                st.pop();
            }
            else if(opr[i].charAt(0) == 'D') {
                int x = st.peek();
                st.push((x*2));
            }
            else if(opr[i].charAt(0) == '+') {
                int x1 = st.pop();
                int x2 = st.pop();
                st.push(x2);
                st.push(x1);
                st.push((x1+x2));
            }
            else {
                int x = Integer.parseInt(opr[i]);
                st.push(x);
            }
        }
        int score = 0;
        while(!st.isEmpty()) {
            score += st.pop();
        }
        return score;
    }
}
