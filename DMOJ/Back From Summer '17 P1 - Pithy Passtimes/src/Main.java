import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int C = 0;
        for(int i = 0 ; i < N; i++){
            String x = kb.next();
            if(x.length() <= 10) {
                C++;
            }
        }
        System.out.println(C);
    }
}
