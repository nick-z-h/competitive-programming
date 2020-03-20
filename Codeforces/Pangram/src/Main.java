import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        boolean[] a = new boolean[26];
        String s = kb.nextLine().toLowerCase();
        int c = 0;
        for(int i = 0; i < s.length(); i++) {
            if(!a[s.charAt(i) - 'a']) {
                c++;
                a[s.charAt(i) - 'a'] = true;
            }
        }
        if(c == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
