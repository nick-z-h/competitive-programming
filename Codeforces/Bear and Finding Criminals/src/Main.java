import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = kb.nextInt();
        int[] t = new int[n + 1];

        int C = 0;
        for(int i = 1; i <= n; i++) {
            t[i] = kb.nextInt();
            C += t[i];
        }

        for(int i = 1; i < a && i <= n - a; i++) {
            if(t[a+i] + t[a-i] == 1) {
                C--;
            }
        }

        System.out.println(C);
    }
}
