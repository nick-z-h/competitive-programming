import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a = 0;
        double b = 0;
        for(int i = 0; i < 3; i++) {
            a += kb.nextInt();
        }
        for(int i = 0; i < 3; i++) {
            b += kb.nextInt();
        }
        int n = kb.nextInt();
        if(Math.ceil(a/5) + Math.ceil(b/10) <= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
