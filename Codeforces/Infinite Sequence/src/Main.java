import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        if(a == b) {
            System.out.println("YES");
        } else if(a < b) {
            if(c > 0 && (b-a)%c == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if(c < 0 && (b-a)%Math.abs(c) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
