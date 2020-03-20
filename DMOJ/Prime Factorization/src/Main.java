import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        for(int i = 0; i<N; i++){
            int M = kb.nextInt();
            for(int j = 2; j<=Math.sqrt(M); j++){
                while(M%j==0){
                    System.out.print(j + " ");
                    M /= j;
                }
            }
            if(M>1){
                System.out.print(M);
            }
            System.out.println();
        }
    }
}
