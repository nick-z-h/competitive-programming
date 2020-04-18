import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String t = kb.next();
        int z = 0;
        for(int i = 0; i < n; i++) {
            if(t.charAt(i) == '0') {
                z++;
            }
        }
        System.out.println(Math.abs(t.length()-z*2));
    }
}
