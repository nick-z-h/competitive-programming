import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String N = kb.nextLine();
        StringBuilder sb = new StringBuilder(N);
        for(int i = 0; i < sb.length() -1; i++) {
            if(!(isLetter(sb.charAt(i)))) {
                if(sb.charAt(i) == ' ') {
                    if(sb.charAt(i+1) == ' ') {
                        sb.deleteCharAt(i+1);
                        i--;
                        continue;
                    }
                    if(sb.charAt(i+1) < 'a') {
                        sb.deleteCharAt(i);
                        i--;
                        continue;
                    }
                } else {
                    if(sb.charAt(i+1) != ' ') {
                        sb.insert(i+1, ' ');
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
    static boolean isLetter(char c) {
        return c >= 'a' && c <= 'z';
    }
}
