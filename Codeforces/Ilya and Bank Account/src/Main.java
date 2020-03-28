import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        if(n<0) {
            StringBuilder sb = new StringBuilder(Integer.toString(n));
            if(sb.charAt(sb.length()-1)>=sb.charAt(sb.length()-2)) {
                sb.deleteCharAt(sb.length()-1);
            } else  {
                sb.deleteCharAt(sb.length()-2);
            }
            if(sb.charAt(1) == '0' && sb.length() == 2) {
                System.out.println("0");
            } else {
                System.out.println(sb.toString());
            }
        } else {
            System.out.println(n);
        }
    }
}
