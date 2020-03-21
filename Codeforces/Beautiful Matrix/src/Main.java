import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] m = new int[5][5];
        int x = 0;
        int y = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                m[i][j] = kb.nextInt();
                if(m[i][j] == 1) {
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(Math.abs(2-x) + Math.abs(2-y));
    }
}
