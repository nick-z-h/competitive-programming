import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while(true) {
            int L = kb.nextInt();
            if(L==0) {
                break;
            }
            kb.nextLine();
            String S = kb.nextLine();
            int RP = -1;
            int DP = -1;
            int d = Integer.MAX_VALUE;
            for(int i = 0; i < L; i++) {
                if(S.charAt(i) == 'Z') {
                    d = 0;
                    break;
                }
                if(S.charAt(i) == 'R') {
                    RP = i;
                }
                if(S.charAt(i) == 'D') {
                    DP = i;
                }
                int t = Math.max(RP, DP) - Math.min(RP, DP);
                if(t < d && RP != -1 && DP != -1) {
                    d = t;
                }
            }
            System.out.println(d);
        }
    }
}
