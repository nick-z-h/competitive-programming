import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        if(a.equals(b)) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(a.length(), b.length()));
        }
    }
}
