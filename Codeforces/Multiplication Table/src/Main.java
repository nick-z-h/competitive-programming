import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt()+1;
        int x = kb.nextInt();
        int C = 0;
        for(int i = 1; i < n; i++) {
            if(x%i == 0 && x/i < n) {
                C++;
            }
        }
        System.out.println(C);
    }
}
