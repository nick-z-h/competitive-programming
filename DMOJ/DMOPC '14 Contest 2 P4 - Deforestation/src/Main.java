import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; i++) {
            if(i==0) {
                s[i] = fr.nextInt();
            } else {
                s[i] = fr.nextInt() + s[i-1];
            }
        }
        int q = fr.nextInt();
        for(int i = 0; i < q; i++) {
            int a = fr.nextInt();
            int b = fr.nextInt();
            if(a == 0) {
                System.out.println(s[b]);
            } else {
                System.out.println(s[b]  - s[a-1]);
            }
        }
    }
}