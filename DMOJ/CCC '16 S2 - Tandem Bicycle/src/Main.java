import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int Q = kb.nextInt();
        int N = kb.nextInt();
        Integer[] D = new Integer[N];
        for(int i=0; i<N; i++){
            D[i] = kb.nextInt();
        }
        Integer[] P = new Integer[N];
        for(int i=0; i<N; i++){
            P[i] = kb.nextInt();
        }

        if(Q==1){
            Arrays.sort(D);
            Arrays.sort(P);
        } else if(Q==2){
            Arrays.sort(D, Collections.reverseOrder());
            Arrays.sort(P);
        }
        int t = 0;
        for(int i = 0; i<N; i++){
            t+= Math.max(D[i],P[i]);
        }
        System.out.println(t);
    }
}