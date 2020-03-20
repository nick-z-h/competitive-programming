import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++){
            System.out.println(sumPF(Integer.parseInt(br.readLine())));
        }
    }
    static long sumPF(long N){
        long sum = 0;
        for(int i = 2; i <= N; i++){
            if(iP(i)){
                sum+=i;
            }
        }
        return sum;
    }
    static boolean iP(long N) {
        if (N < 2) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        if (N % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}