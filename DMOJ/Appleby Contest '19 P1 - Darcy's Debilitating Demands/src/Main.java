import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for(int i = 0; i < T; i++) {
            long N = kb.nextLong();
            long A = kb.nextLong();
            long B = kb.nextLong();
            long C = kb.nextLong();
            System.out.println(s(N, A, B, C));
        }
    }
    static String s(long N, long A, long B, long C) {
        if(A+B+C>N) {
            if(C >= N) {
                return "0" + " " + "0" + " " + N;
            } else {
                N -= C;
                if(B >= N) {
                    return 0 + " " + N + " " + C;
                } else {
                    N-=B;
                    if(A >= N) {
                        return N + " " + B + " " + C;
                    }
                }
            }
        } else if(A+B+C == N) {
            return A + " " + B + " " + C;
        }
        return "-1";
    }
}