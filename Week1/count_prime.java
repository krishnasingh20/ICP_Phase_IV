import java.util.Scanner;
import java.util.Arrays;
public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] isprime = new boolean[n + 1];
        Arrays.fill(isprime, true);
        isprime[0] = isprime[1] = false;
        for(int i = 2; i * i <= n; i++) {
            if(isprime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isprime[j] = false;
                }
            }
        }

        int ans = 0; //total prime number till n.
        for(int i = 0; i < n + 1; i++) {
            if(isprime[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
