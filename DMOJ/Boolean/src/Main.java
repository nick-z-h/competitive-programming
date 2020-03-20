import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String N = kb.nextLine();
        boolean b;
        if(N.length()>7) {
            if ((N.substring(N.length() - 5)).equals(" True")) {
                b = true;
                for (int i = 0; i < N.length() - 4; i += 4) {
                    b = !b;
                }
            } else {
                b = false;
                for (int i = 0; i < N.length() - 5; i += 4) {
                    b = !b;
                }
            }
            if (b) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println(N);
        }
    }
}
