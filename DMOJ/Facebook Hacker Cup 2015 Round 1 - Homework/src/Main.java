import java.io.*;
import java.util.StringTokenizer;
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        FastReader kb = new FastReader();
        int[] FN = new int[10000001];
        int T = kb.nextInt();
        for(int i = 2; i < FN.length; i++){
            if(FN[i]==0){
                FN[i] = 1;
                for(int j = 2; i*j< FN.length; j++){
                    FN[i*j]++;
                }
            }
        }
        for(int t = 1; t<=T; t++){
            int a = kb.nextInt(), b = kb.nextInt(), k = kb.nextInt();
            int R = 0;
            for(int i = a; i <= b; i++){
                if(FN[i]==k){
                    R++;
                }
            }
            pw.println("Case #" + t + ": " + R);
        }
        pw.close();
    }
}