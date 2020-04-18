import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] a = new String[5];
        String[] b = new String[5];
        int c = 0;
        for(int i = 0; i < 5; i++) {
            a[i] = kb.next();
            b[i] = kb.next();
            if(b[i].equals("SCHOOL")) {
                break;
            }
            c++;
        }
        for(int i = 0; i <= c; i++) {
            if(a[i].equals("R")) {
                a[i] = "LEFT";
            } else if(a[i].equals("L")) {
                a[i] = "RIGHT";
            }
        }
        for(int i = c; i > 0; i--) {
            System.out.println("Turn " + a[i] + " onto " + b[i-1] + " street.");
        }
        System.out.println("Turn " + a[0] + " into your HOME.");
    }
}
