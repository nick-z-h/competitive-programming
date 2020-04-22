import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        boolean[] c = new boolean[26];
        for(int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a'] = true;
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(c[i]) {
                count++;
            }
        }
        if(count%2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
