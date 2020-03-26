import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = 2007;
        int b = 2;
        int c = 27;
        int n = kb.nextInt();
        for(int i = 0; i < n; i++) {
            int y = kb.nextInt();
            int m = kb.nextInt();
            int d = kb.nextInt();
            if(y < a - 18) {
                System.out.println("Yes");
            } else if(y == a-18) {
                if(m < b) {
                    System.out.println("Yes");
                } else if(m == b) {
                    if(d <= c) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}
