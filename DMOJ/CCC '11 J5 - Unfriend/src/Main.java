import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] A = {1,1,1,1,1,1,1};
        for(int i = 0; i<N-1; i++){
            int B = kb.nextInt();
            A[B] = A[B]*(A[i+1]+1);
        }
        System.out.print(A[N]);
    }
}