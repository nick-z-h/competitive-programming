import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] N = new int[3];
        N[0] = kb.nextInt();
        N[1] = kb.nextInt();
        N[2] = kb.nextInt();
        Arrays.sort(N);
        System.out.println(N[1]);
    }
}