import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int p = kb.nextInt();
        int g = kb.nextInt();
        int r = kb.nextInt();
        int o = kb.nextInt();
        int n = kb.nextInt();

        int c = 0;
        int m = Integer.MAX_VALUE;
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                for(int l = 0; l <= n; l++) {
                    for(int k = 0; k <= n; k++) {
                        if(i*p + j*g + r*l + o*k == n) {
                            c++;
                            if(i + j + l + k < m) {
                                m = i + j + l + k;
                            }
                            System.out.println("# of PINK is " + i + " # of GREEN is " + j + " # of RED is " + l + " # of ORANGE is " + k);
                        }
                    }
                }
            }
        }
        System.out.println("Total combinations is " + c + ".");
        System.out.println("Minimum number of tickets to print is " + m + ".");
    }
}