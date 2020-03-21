import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = kb.nextInt();
        }
        int C = 0;
        for(int i = 0; i < N && (i < K || a[i] == a[i-1]) && a[i] != 0; i++) {
            C++;
        }
        System.out.println(C);
    }
}
