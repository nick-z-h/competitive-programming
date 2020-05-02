import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        int m = 0;
        for(int i = 0; i < n.length(); i++) {
            for(int j = i; j < n.length(); j++) {
                if(isP(n.substring(i, j+1)) && j-i+1 > m) {
                    m = j-i+1;
                }
            }
        }
        System.out.println(m);
    }
    static boolean isP(String n) {
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        return n.equals(sb.toString());
    }
}
