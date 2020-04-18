import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.nextLine();
        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        int V = 0;
        int H = 0;
        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == 'V') {
                V++;
            }
            if(n.charAt(i) == 'H') {
                H++;
            }
        }
        V %= 2;
        H %= 2;
        if(V == 1) {
            a[0][0] = 2;
            a[0][1] = 1;
            a[1][0] = 4;
            a[1][1] = 3;
        }
        if(H == 1) {
            int t = a[0][0];
            a[0][0] = a[1][0];
            a[1][0] = t;
            t = a[0][1];
            a[0][1] = a[1][1];
            a[1][1] = t;
        }
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
