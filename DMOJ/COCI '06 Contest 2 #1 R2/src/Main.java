import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int r1 = kb.nextInt();
        int s = kb.nextInt();
        System.out.println(2*s - r1);
    }
}