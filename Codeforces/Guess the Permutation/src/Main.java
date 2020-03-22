import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        int[] p = new int[n];
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int C = 0;
                for(int g = 0; g < n; g++) {
                    if(a[j][g] == i) {
                        C++;
                    }
                }
                if(C == n - i) {
                    p[j] = i;
                    break;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(p[i]!=0) {
                System.out.format("%d ", p[i]);
            } else {
                System.out.format("%d ", n);
            }
        }
    }
}
