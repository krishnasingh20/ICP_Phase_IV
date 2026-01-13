import java.util.*;
public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int curr = prices[0];
        for(int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i]-curr);
            curr = Math.min(curr, prices[i]);
        }
        return profit;
    }
}
// TC-> O(n)
// Sc-> O(1)
