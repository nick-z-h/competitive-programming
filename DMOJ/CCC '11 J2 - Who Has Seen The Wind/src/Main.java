import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int h = kb.nextInt();
        int M = kb.nextInt();
        boolean f = true;
        for(int i = 1; i <= M; i++) {
            double A = -6*(i*i*i*i) + h*(i*i*i) + 2*(i*i) + i;
            if(A <= 0) {
                System.out.println("The balloon first touches ground at hour:");
                System.out.print(i);
                f = false;
                break;
            }
        }
        if(f) {
            System.out.println("The balloon does not touch ground in the given time.");
        }
    }
}
