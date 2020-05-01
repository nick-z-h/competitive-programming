import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (kb.hasNext()) {
            int n = kb.nextInt();
            if (n == 0) {
                break;
            }
            int[][] arr = new int[n][n];
            int[] r = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = kb.nextInt();
                    r[i] += arr[i][j];
                    c[j] += arr[i][j];
                }
            }
            int f = 0;
            int x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (r[i] % 2 == 1 && c[j] % 2 == 1) {
                        r[i]--;
                        c[j]--;
                        x = i + 1;
                        y = j + 1;
                        f++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (r[i] % 2 == 1 || c[i] % 2 == 1) {
                    f = 10;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("OK");
            } else if (f == 1) {
                System.out.println("Change bit (" + x + "," + y + ")");
            } else {
                System.out.println("Corrupt");
            }
        }
    }
}