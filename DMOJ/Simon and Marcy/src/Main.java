import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int C = kb.nextInt();
        int M = kb.nextInt();
        int[] a = new int[M + 1];
        Arrays.fill(a, 0);
        for (int i = 1; i <= C; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            for (int j = M; j > 0; j--) {
                if (j - y >= 0) {
                    a[j] = Math.max(a[j - y] + x, a[j]);
                }
            }
        }
        System.out.println(a[M]);
    }
}