import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x1 = kb.nextInt();
        int y1 = kb.nextInt();
        int x2 = kb.nextInt();
        int y2 = kb.nextInt();
        findTrees(x1, y1, x2, y2);
    }
    static void findTrees(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);
        if(dx != dy && dy > 0 && dx > 0) {
            System.out.println(-1);
            return;
        }
        if(x1 == x2) {
            int x3 = x1 + dy;
            int y3 = y1;
            int x4 = x1 + dy;
            int y4 = y2;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            return;
        }
        if(y1 == y2) {
            int x3 = x1;
            int y3 = y1 + dx;
            int x4 = x2;
            int y4 = y1 + dx;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            return;
        }
        int x3 = x1;
        int y3 = y2;
        int x4 = x2;
        int y4 = y1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
