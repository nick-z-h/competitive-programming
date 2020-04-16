import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        boolean f = false;
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            if(a[i] == 1) {
                f = true;
            }
        }
        if(f) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }
    }
}
