import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = kb.nextInt();
        int[][] p = {{1,12},{2,6},{3,4},{4,3},{6,2},{12,1}};
        while(t-->0) {
            ArrayList<Integer> g = new ArrayList<>();
            String s = kb.next();
            for(int i = 0; i < 6; i++) {
                if (ps(s, p[i][0], p[i][1])) {
                    g.add(i);
                }
            }
            sb.append(g.size());
            for(int i = 0; i < g.size(); i++) {
                sb.append(" " + p[g.get(i)][0] + "x" + p[g.get(i)][1]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    static boolean ps(String s, int a, int b) {
        char[][] m = new char[a][b];
        for(int i = 0, k = 0; i < a; i++) {
            for (int j = 0; j < b; j++, k++) {
                m[i][j] = s.charAt(k);
            }
        }
        boolean f = false;
        for(int j = 0; j < b && !f; j++) {
            f = true;
            for (int i = 0; i < a && f; i++) {
                if (m[i][j] == 'O') {
                    f = false;
                }
            }
        }
        return f;
    }
}