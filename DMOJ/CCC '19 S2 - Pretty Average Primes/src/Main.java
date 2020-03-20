import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int X = Integer.parseInt(br.readLine());
            for(int j = X, g = X; j>=2; j--, g++){
                if(p(j)&&p(g)) {
                    System.out.println(j + " " + g);
                    break;
                }
            }
        }
        br.close();
    }
    static boolean p(int N){
        if(N<2){
            return false;
        }
        if(N==2){
            return true;
        }
        if(N%2==0){
            return false;
        }
        for(int i = 3; i<=Math.sqrt(N); i+=2){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}