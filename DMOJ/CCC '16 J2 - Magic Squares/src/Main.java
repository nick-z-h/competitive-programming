import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] a = new int[4][4];
        int sum = 0;
        boolean f = true;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        for(int i = 0; i < 4; i++) {
            int t = 0;
            for(int j = 0; j < 4; j++) {
                if(i==0) {
                    sum += a[i][j];
                }
                t += a[i][j];
            }
            if(sum!= t) {
                f = false;
                break;
            }
        }
        if(f) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }
    }
}
