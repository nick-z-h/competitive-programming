import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while(true) {
            int n = kb.nextInt();
            if(n == 0) {
                break;
            } else {
                int x = 0;
                int y = 0;
                boolean f = true;
                for(int i = 0; i < 32; i++) {
                    if(((1 << i) & n) != 0) {
                        if(f) {
                            x |= 1 << i;
                        } else {
                            y |= 1 << i;
                        }
                        f = !f;
                    }
                }
                System.out.println(x + " " + y);
            }
        }
    }
}