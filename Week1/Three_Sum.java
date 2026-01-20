import java.util.*;
public class Three_Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    List<List<Integer>> ans = threeSum(nums);
    for(List<Integer> ll: ans) {
      for(int l: ll) {
        System.out.print(l+" ");
      }
      System.out.println();
    }
  }
  public static List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>> ans = new ArrayList<>();
      int n = nums.length;
      for(int i = 0; i < n; i++) {
          if(i > 0 && nums[i] == nums[i-1]) {
              continue;
          }
          int left = i+1;
          int right = n-1;
          while(left < right) {
              if(nums[i]+nums[left]+nums[right] == 0) {
                  ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                  while(left+1 < right && nums[left] == nums[left+1]) {
                      left++;
                  }
                  while(right-1 > left && nums[right] == nums[right-1]) {
                      right--;
                  }
                  left++;
                  right--;
              }
              else if(nums[i]+nums[left]+nums[right] > 0) {
                  right--;
              }
              else {
                  left++;
              }
          }
      }
      return ans;
  }
}

// TC--> O(n^2) + O(nlogn)
// SC--> O(n)
