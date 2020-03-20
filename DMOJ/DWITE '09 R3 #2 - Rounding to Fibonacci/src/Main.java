import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            int low = 0;
            int N = kb.nextInt();
            while (f(low + 1) <= N) {
                low++;
            }
            int high = low + 1;
            if (f(high) - N > N - f(low)) {
                System.out.println(f(low));
            } else {
                System.out.println(f(high));
            }
        }
    }
    static int f(int N) {
        if(N == 0) {
            return 0;
        }
        if(N == 1) {
            return 1;
        }
        return (int) Math.floor(Math.pow((1 + Math.sqrt(5))/2, N)/Math.sqrt(5) + 0.5);
    }
}
