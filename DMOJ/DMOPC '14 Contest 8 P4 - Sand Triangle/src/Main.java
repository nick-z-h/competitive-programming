import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long N = kb.nextLong();
        int S = 1;
        int P = S;
        for(long i = 0; ; i++){
            S+=i;
            if(S>N){
                long C = 0;
                for(long g = P; g<S; g++){
                    C+=g;
                }
                System.out.println(C);
                break;
            }
            P=S;
        }
    }
}