import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        boolean[] ac = new boolean[200];
        ac[0] = true;
        for(int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            for(int j = a+1; j <= b; j++) {
                ac[j] = true;
            }
        }
        for(int i = 1; i <= m; i++) {
            if(!ac[i]) {
                ac[0] = false;
                break;
            }
        }
        if(ac[0]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}