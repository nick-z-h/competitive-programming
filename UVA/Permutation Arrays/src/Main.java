import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int c = Integer.parseInt(br.readLine());
        for(int i = 0; i < c; i++) {
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int n = st.countTokens();
            int[] g = new int[n];
            for(int j = 0; j < n; j++) {
                g[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            String[] a = new String[st.countTokens()];
            String[] b = new String[a.length];
            for(int j = 0; j < a.length; j++) {
                a[j] = st.nextToken();
            }
            for(int j = 0; j < b.length; j++) {
                b[g[j] - 1] = a[j];
            }
            for(int j = 0; j < a.length; j++) {
                System.out.println(b[j]);
            }
            if(c-1!=i) {
                System.out.println();
            }
        }
    }
}
