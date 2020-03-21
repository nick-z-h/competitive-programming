import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int K = kb.nextInt();
        int R = kb.nextInt();
        int m = 10;
        for(int i = 1; i <= 10; i++) {
            int c = i*K;
            if(c%10== R || c%10 == 0) {
                m = i;
                break;
            }
        }
        System.out.println(m);
    }
}
