import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int z = kb.nextInt();
        int c = 0;
        for(int i = 1; i < z+1; i++) {
            if(i%n == 0 && i%m == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
