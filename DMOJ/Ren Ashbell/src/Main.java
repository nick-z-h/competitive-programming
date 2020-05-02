import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = kb.nextInt();
        boolean f = true;
        for(int i = 1; i < n; i++) {
            if(kb.nextInt() >= a) {
                f = false;
                break;
            }
        }
        if(f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
