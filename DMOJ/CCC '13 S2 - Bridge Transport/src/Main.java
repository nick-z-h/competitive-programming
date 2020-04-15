import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int W = kb.nextInt();
        int N = kb.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int t = 0;
        for(int i = 0; i < N; i++) {
            int d = kb.nextInt();
            int s = a + b + c + d;
            if(s <= W) {
                t++;
                a = b;
                b = c;
                c = d;
            } else {
                break;
            }
        }
        System.out.println(t);
    }
}
