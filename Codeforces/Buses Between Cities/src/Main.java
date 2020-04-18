import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int ta = kb.nextInt();
        int b = kb.nextInt();
        int tb = kb.nextInt();
        String dt = kb.next();
        int m = Integer.parseInt(dt.substring(0, 2)) * 60 + Integer.parseInt(dt.substring(3));
        int c = 0;
        int k = 0;
        while(k * b + 300 < m + ta && k*b + 300 < 1440) {
            if(k++*b+300+tb>m) {
                c++;
            }
        }
        System.out.println(c);
    }
}
