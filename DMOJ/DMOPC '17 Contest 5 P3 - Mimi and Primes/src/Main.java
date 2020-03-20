import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long[] nArr = new long[N];
        st = new StringTokenizer(br.readLine());
        long gcd = Long.parseLong(st.nextToken());
        for (int i = 1; i < nArr.length; i++) {
            nArr[i] = Long.parseLong(st.nextToken());
            gcd = GCD(gcd, nArr[i]);
        }
        long gp = 0;
        for(long i = 2; i <= Math.sqrt(gcd); i++){
            if(gcd%i==0){
                if(gp < i){
                    gp = i;
                }
                gcd/=i;
                i--;
            }
        }
        gp = Math.max(gp, gcd);
        if(gp<2){
            System.out.println("DNE");
        } else {
            System.out.println(gp);
        }
    }
    static long GCD(long a, long b){
        if(a==0){
            return b;
        }
        return GCD(b % a, a);
    }
}