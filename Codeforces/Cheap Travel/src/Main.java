import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double n = kb.nextDouble();
        double m = kb.nextDouble();
        double a = kb.nextDouble();
        double b = kb.nextDouble();

        int x = (int)(n/m);
        int y = (int)Math.ceil(n/m);

        int q = (int)((x * b) + ((n - (x * m)) * a));
        int r = (int)(a * n);
        int s = (int)(y*b);

        System.out.println(Math.min(Math.min(q,r),s));
    }
}
