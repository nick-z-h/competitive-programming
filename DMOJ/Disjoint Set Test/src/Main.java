import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main {
    static int[] parent;
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
                } catch (IOException e) {
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
        FastReader kb = new FastReader();
        int N = kb.nextInt();
        int M = kb.nextInt();
        ArrayList<Integer> E = new ArrayList<>();
        parent = new int[N + 1];
        int c = 0;
        for(int i = 1; i < N; i++){
            parent[i] = i;
        }
        for(int i = 1; i<= M; i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            int rX = find(x);
            int rY = find(y);
            if(rX != rY) {
                union(rX, rY);
                c++;
                E.add(i);
            }
            if(c == N - 1){
                break;
            }
        }
        if(c == N-1) {
            for(int i = 0; i < E.size(); i++) {
                System.out.println(E.get(i));
            }
        } else {
            System.out.println("Disconnected Graph");
        }
    }
    static int find(int N){
        if(N != parent[N]){
            parent[N] = find(parent[N]);
        }
        return parent[N];
    }
    static void union(int x, int y) {
        parent[x] = y;
    }
}
