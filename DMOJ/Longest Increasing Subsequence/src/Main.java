import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int[] dp = new int[n];
        int m = 0;
        for(int A : a) {
            int i = Arrays.binarySearch(dp, 0 , m, A);
            if(i < 0) {
                i = Math.abs(i) -1;
            }
            dp[i] = A;
            if(i == m) {
                m++;
            }
        }
        System.out.println(m);
    }
}
