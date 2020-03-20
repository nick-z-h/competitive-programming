import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int R = kb.nextInt();
        int C = kb.nextInt();
        int[][] L = new int[R+1][C+1];
        for(int i = 1; i<L.length; i++){
            for(int j = 1; j<L[i].length; j++){
                L[i][j] = -1;
            }
        }
        L[1][1]=1;
        int K = kb.nextInt();
        for(int i = 1; i<=K; i++){
            int X = kb.nextInt();
            int Y = kb.nextInt();
            L[X][Y]=0;
        }
        for(int i = 1; i<L.length;i++){
            for(int j = 1; j<L[i].length;j++){
                if(L[i][j]==-1){
                    L[i][j] = Math.max(0,L[i-1][j]) + Math.max(0,L[i][j-1]);
                }
            }
        }
        System.out.println(L[R][C]);
    }
}
