import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = 0;
        int b = 0;
        while(n > 1) {
            if(n%2 == 0) {
                a++;
                n -= 2;
            } else {
                b++;
                n -= 3;
            }
        }
        System.out.println(a + b);
        for(int i = 0; i < a; i++) {
            System.out.print(2 + " ");
        }
        for(int i = 0; i < b; i++) {
            System.out.print(3 + " ");
        }
    }
}
