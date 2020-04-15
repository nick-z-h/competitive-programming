import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        long M = kb.nextLong();
        long[] C = new long[N];
        for(int i = 0; i < N; i++) {
            C[i] = kb.nextLong();
        }
        long s = 0;
        int en;
        int st = 0;
        int m = -1;
        for(int i = 0; i < N; i++) {
            s+= C[i];
            en = i;
            while(s >= M) {
                s -= C[st];
                st++;
            }
            m = Math.max(m, en - st + 1);
        }
        System.out.println(m);
    }
}
