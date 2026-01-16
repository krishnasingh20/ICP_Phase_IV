import java.util.*;
public class Main {
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
  public static double findMedianSortedArrays(int[] a, int[] b) {
      if(a.length > b.length) {
          int[] temp = a;
          a = b;
          b = temp;
      }
      int n = a.length;
      int m = b.length;
      int t = n+m;
      int h = (t+1)/2;
      int low = 0;
      int high = n;
      while(low <= high) {
          int al = (low + high)/2;
          int bl = h - al;
          int alm1 = (al == 0)?Integer.MIN_VALUE:a[al-1];
          int alm2 = (al == n)?Integer.MAX_VALUE:a[al];
          int blm1 = (bl == 0)?Integer.MIN_VALUE:b[bl-1];
          int blm2 = (bl == m)?Integer.MAX_VALUE:b[bl];
          if(alm1 <= blm2 && blm1 <= alm2) {
              double ans = 0;
              if((t & 1) == 1) {
                  ans = Math.max(alm1, blm1)/1.0;
              }
              else {
                  ans = (Math.max(alm1, blm1)+Math.min(alm2, blm2))/2.0;
              }
              return ans;
          }
          else if(alm1 > blm2) {
              high = al - 1;
          }
          else {
              low = al + 1;
          }
      }
      return 0.0;
  }
}

// TC--> O(log(min(n, m))
// SC--> O(1)
