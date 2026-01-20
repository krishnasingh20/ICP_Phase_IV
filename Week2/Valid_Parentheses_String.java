import java.util.Scanner;

public class Valid_Parentheses_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        dp = new Boolean[s.length()][s.length()];
        System.out.println(valid(s, 0, 0));
    }
    static Boolean[][] dp;
    public static boolean valid(String s, int i, int open) {
        if(i == s.length()) {
            if(open == 0) {
                return true;
            }
            return false;
        }
        if(dp[i][open] != null) {
            return dp[i][open];
        }
        boolean op = false;
        boolean cl = false;
        boolean star = false;
        if(s.charAt(i) == '(') {
            op = valid(s, i+1, open+1);
        }
        else if(s.charAt(i) == ')') {
            if(open > 0) {
                cl = valid(s, i+1, open-1);
            }
        }
        else {
            if(open > 0) {
                boolean cl1 = valid(s, i+1, open-1);
                star = (star || cl1);
            }
            boolean op1 = valid(s, i+1, open+1);
            boolean empty = valid(s, i+1, open);
            star = (star || op1 || empty);
        }
        return dp[i][open] = (op || cl || star);
    }
}
