import java.util.*;
public class Median_Sorted_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }
    System.out.println(findMedianSortedArrays(a, b));
  }
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] nums = new int[n+m];
        int j = 0;
        for(int i = 0;i < n;i++){
            nums[j++] = nums1[i];
        }
        for(int i = 0;i < m;i++){
            nums[j++] = nums2[i];
        }
        Arrays.sort(nums);
        if((n+m) % 2 != 0){
            double median =(double) nums[(n+m)/2];
            return Double.parseDouble(String.format("%.5f",median));
        }else{
            double median = (double)(nums[(n+m-1)/2]+nums[(n+m)/2])/2;
            return Double.parseDouble(String.format("%.5f",median));
        }
    }
}
