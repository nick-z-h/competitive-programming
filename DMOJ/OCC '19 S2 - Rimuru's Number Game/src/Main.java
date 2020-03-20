import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long N = kb.nextLong();
        System.out.println(NG(2, N) + NG(3, N));

    }
    static int NG(long Q, long N) {
        if(Q>N) {
            return 0;
        }
        return NG(Q*10+3, N) + NG(Q*10+2, N) + 1;
    }
}

