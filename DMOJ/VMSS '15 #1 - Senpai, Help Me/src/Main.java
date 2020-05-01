import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        double a = Math.sqrt(n);
        for(int i = (int)a; i > 1; i--) {
            if(n%i==0) {
                int j = n/i;
                System.out.println(i*2 + j*2);
                break;
            }
        }

    }
}
