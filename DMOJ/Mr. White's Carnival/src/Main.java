import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int C = 0;
        for(int i = 1 ; i <= N; i++){
            if(N%i==0){
                C+=i;
            }
        }
        System.out.println(C);
    }
}
