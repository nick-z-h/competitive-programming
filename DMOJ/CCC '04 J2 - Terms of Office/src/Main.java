import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        System.out.println("All positions change in year " + x);
        x += 60;
        while(x <= y) {
            System.out.println("All positions change in year " + x);
            x+=60;
        }
    }
}
