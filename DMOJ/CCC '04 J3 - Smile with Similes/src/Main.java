import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        String[] arrN = new String[N];
        String[] arrM = new String[M];
        kb.nextLine();
        for(int i = 0; i<N; i++){
            arrN[i]=kb.nextLine();
        }
        for(int i = 0; i<M; i++){
            arrM[i]=kb.nextLine();
        }
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                System.out.println(arrN[i] + " as " + arrM[j]);
            }
        }
    }
}
