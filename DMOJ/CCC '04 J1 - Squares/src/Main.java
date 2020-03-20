import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        System.out.println("The largest square has side length " + (int)Math.sqrt(N) + ".");
    }
}