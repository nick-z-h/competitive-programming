import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] t = new int[N][];
        for(int i = 0; i<t.length; i++){
            t[i] = new int[i+1];
            for(int j = 0; j<i+1; j++){
                t[i][j]=kb.nextInt();
            }
        }
        for(int i = t.length-1; i>0; i--){
            for(int j = 0; j<t[i].length-1; j++){
                t[i-1][j] += Math.max(t[i][j],t[i][j+1]);
            }
        }
        System.out.println(t[0][0]);
    }
}