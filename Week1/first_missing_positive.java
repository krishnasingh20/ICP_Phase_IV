import java.util.*;
public class first_missing_positive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(firstMissingPositive(arr));
  }
  public static int firstMissingPositive(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      for(int num: nums) {
          set.add(num);
      }
      int val = 1;
      while(set.contains(val)) {
          val++;
      }
      return val;
  }
}
