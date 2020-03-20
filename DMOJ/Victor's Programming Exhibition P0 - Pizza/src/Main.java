import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int X = kb.nextInt();
        int N = kb.nextInt();
        System.out.println(X/N + " " + X%N);
    }
}
