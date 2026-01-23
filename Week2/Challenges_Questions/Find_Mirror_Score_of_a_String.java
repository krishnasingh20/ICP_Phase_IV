package Challenges_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_Mirror_Score_of_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(mirrorScore(s));
    }
    public static int mirrorScore(String s) {
        int n = s.length();
        List<Integer>[] arr = new ArrayList[26];
        for(int i = 0; i < 26; i++) {
            arr[i] = new ArrayList<>();
        }
        int score = 0;
        for(int i = 0; i < n; i++) {
            int x = s.charAt(i)-'a';
            char corr = (char)((25-x)+'a');
            if(!arr[corr - 'a'].isEmpty()) {
                List<Integer> ll = arr[corr-'a'];
                int j = ll.removeLast();
                score += (i-j);
            }
            else {
                arr[x].add(i);
            }
        }
        return score;
    }
}
