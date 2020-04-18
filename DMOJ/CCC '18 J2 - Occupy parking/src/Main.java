import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String a = kb.next();
        String b = kb.next();
        int c =0;
        for(int i = 0; i < n; i++) {
            if(a.charAt(i) == b.charAt(i) && a.charAt(i) != '.') {
                c++;
            }
        }
        System.out.println(c);
    }
}
