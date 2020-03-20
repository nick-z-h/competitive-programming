import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while(true) {
            int B = kb.nextInt();
            if(B == 0) {
                break;
            }
            int N = kb.nextInt();
            int[] R = new int[B];
            for (int i = 0; i < R.length; i++) {
                R[i] = kb.nextInt();
            }
            boolean f = true;
            for (int i = 0; i < N; i++) {
                int D = kb.nextInt() - 1;
                int C = kb.nextInt() - 1;
                int V = kb.nextInt();
                R[D] -= V;
                R[C] += V;
            }
            for (int i = 0; i < R.length; i++) {
                if (R[i] < 0) {
                    f = false;
                    break;
                }
            }
            if (f) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
    }
}
