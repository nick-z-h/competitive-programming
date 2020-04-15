import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int L = 0;
        int S = 0;
        while(true) {
            String s = kb.next();
            if(s.equals("EOF")) {
                break;
            }
            if(N > 999) {
                N = 1;
            }
            if(s.equals("TAKE")) {
                N++;
                L++;
            }
            if(s.equals("SERVE")) {
                S++;
            }
            if(s.equals("CLOSE")) {
                System.out.println(L + " " + (L-S) + " " + N);
                S = 0;
                L = 0;
            }
        }
    }
}
