import java.util.*;
public class Find_Index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    System.out.println(firstPosition(s1, s2));
  }
  public static int firstPosition(String haystack, String needle) {
    if(haystack.length() < needle.length()) {
      return -1;
    }
    int n = haystack.length();
    int m = needle.length();
    for(int i = 0; i <= n-m; i++) {
      int j = i;
      int k = 0;
      while(j < n && k < m && haystack.charAt(j) == needle.charAt(k)) {
        j++;
        k++;
      }
      if(k == m) {
        return i;
      }
    }
    return -1;
  }
}

// TC--> O(n*m)
// SC--> O(1)
