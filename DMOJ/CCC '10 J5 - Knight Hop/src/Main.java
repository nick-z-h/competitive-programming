import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static class node {
        int x, y, d;
        public node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    static boolean v(int x, int y, int N) {
        if (x >= 1 && x <= N && y >= 1 && y <= N) {
            return true;
        } else {
            return false;
        }
    }
    static int BFS(int start[], int end[], int N) {
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        ArrayList<node> l = new ArrayList<>();
        l.add(new node(start[0], start[1], 0));
        node t;
        int x, y;
        boolean c[][] = new boolean[N + 1][N + 1];
        c[start[0]][start[1]] = true;
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                c[i][j] = false;
            }
        }
        while (!l.isEmpty()) {
            t = l.get(0);
            l.remove(0);
            if (t.x == end[0] && t.y == end[1]) {
                return t.d;
            }
            for (int i = 0; i < 8; i++) {
                x = t.x + dx[i];
                y = t.y + dy[i];
                if (v(x, y, N) && !c[x][y]) {
                    c[x][y] = true;
                    l.add(new node(x, y, t.d + 1));
                }
            }
        }
        return 6;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = 8;
        int x1 = kb.nextInt();
        int y1 = kb.nextInt();
        int x2 = kb.nextInt();
        int y2 = kb.nextInt();
        int start[] = {x1, y1};
        int end[] = {x2, y2};
        System.out.println(BFS(start, end, N));
    }
}