package Stack_Basic_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for(int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] ans = nextGreaterElement(nums1, nums2);
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.putIfAbsent(nums2[i], i);
        }
        for(int i = 0; i < nums1.length; i++) {
            int idx = map.get(nums1[i]);
            boolean present = false;
            for(int j = idx+1; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]) {
                    nums1[i] = nums2[j];
                    present = true;
                    break;
                }
            }
            if(!present) {
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
