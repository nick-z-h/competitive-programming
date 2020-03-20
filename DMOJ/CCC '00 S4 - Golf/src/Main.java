import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);
        int D = kb.nextInt();
        int C = kb.nextInt();

        int s[] = new int[D + 1];
        Arrays.fill(s, Integer.MAX_VALUE);
        s[0] = 0;

        int cArr[] = new int[C];
        for(int i = 0; i < cArr.length; i++) {
            cArr[i] = kb.nextInt();
        }

        for(int i = 0; i < C; i++) {
            for(int j = 1; j <= D; j++) {
                if(cArr[i] <= j) {
                    s[j] = Math.min(s[j], s[j - cArr[i]] + 1);
                }
            }
        }

        if(s[D] == Integer.MAX_VALUE) {
            System.out.println("Roberta acknowledges defeat.");
        } else {
            System.out.println("Roberta wins in " + s[D] + " strokes.");
        }
    }
}