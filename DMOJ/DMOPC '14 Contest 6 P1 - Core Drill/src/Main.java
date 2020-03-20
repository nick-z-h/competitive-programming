import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int r = kb.nextInt();
        int h = kb.nextInt();
        System.out.println(Math.PI*(r*r)*h/3);
    }
}