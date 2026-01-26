package Challenges_Questions;

import java.util.Scanner;

public class Shortest_Subarray_to_Removed_Make_Array_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findLengthOfShortestSubarray(n, arr));
    }
    public static int findLengthOfShortestSubarray(int n, int[] arr) {
        int i = 0;
        int j = n - 1;
        while(i+1 < n && arr[i] <= arr[i+1]) {
            i++;
        }
        while(j > 0 && arr[j] >= arr[j-1]) {
            j--;
        }
        if(i == n-1) {
            return 0;
        }
        int ans = Math.min((n-(i+1)), j);
        int k = 0;
        int l = j;
        while(k <= i && l < n) {
            if(arr[k] <= arr[l]) {
                ans = Math.min(ans, (l - k - 1));
                k++;
            }
            else {
                l++;
            }
        }
        return ans;
    }
}
