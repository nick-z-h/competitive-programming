import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t1 = kb.nextInt();
        int t2 = kb.nextInt();
        int t3 = t1 - t2;
        int l = 2;

        while(t3 >= 0) {
            l++;
            t1 = t2;
            t2 = t3;
            t3 = t1 - t2;
        }
        System.out.println(l);
    }
}
