import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++ ) {
            a[i] = kb.nextInt();
        }
        for(int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcs(a, b, 0, 0, dp));
    }
    static int lcs(int[] a, int[] b, int i, int j, int[][] dp) {
        if(i == a.length || j == b.length) {
            return 0;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        if(a[i] == b[j]) {
            return dp[i][j] = lcs(a, b, i+1, j+1, dp) +1;
        }
        return dp[i][j] = Math.max(lcs(a, b, i+1, j, dp), lcs(a, b, i, j+1, dp));
    }
}