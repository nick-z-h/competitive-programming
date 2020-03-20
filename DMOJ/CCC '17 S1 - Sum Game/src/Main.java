import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        FastReader kb = new FastReader();
        int N = kb.nextInt();
        int[] a = new int[N];
        for(int i = 0; i<N; i++){
            a[i] = kb.nextInt();
        }
        int[] b = new int[N];
        for(int i = 0; i<N; i++){
            b[i] = kb.nextInt();
        }
        int[] c = new int[N];
        int k = 0;
        int sum = 0;
        for(int i = 0; i<N; i++){
            k+=a[i];
            sum+=b[i];
            if(sum == k){
                int day = i;
                c[i] = day+1;
            }
        }
        Arrays.sort(c);
        System.out.println(c[N-1]);
    }
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
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}