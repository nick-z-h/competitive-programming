import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = 0;
        for(int i = 0; i < 5; i++) {
            t += kb.nextInt();
        }
        if(t%5 == 0 && t>=5) {
            System.out.println(t/5);
        } else {
            System.out.println(-1);
        }
    }
}
