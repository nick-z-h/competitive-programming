import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String n = kb.next();
                long s = 0;
                boolean f = true;
                for (int g = n.length() -1; g >= 0; g--) {
                    int t = n.charAt(g) - '0';
                    if (f) {
                        t *= 2;
                        while (t != 0) {
                            s += t % 10;
                            t /= 10;
                        }
                    } else {
                        s += t;
                    }
                    f = !f;
                }
                System.out.print((10 - s % 10) % 10);
            }
            System.out.println();
        }
    }
}