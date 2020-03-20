import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        long s = 0;
        long o = Long.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            long t = kb.nextLong();
            s += t;
            if(t%2!=0) {
                o = Math.min(o, t);
            }
        }
        if(s%2!=0) {
            s-=o;
        }
        System.out.println(s);
    }
}
