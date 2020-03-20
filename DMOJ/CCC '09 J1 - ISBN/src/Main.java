import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int total = 91;
        total += kb.nextInt();
        total += kb.nextInt()*3;
        total += kb.nextInt();
        System.out.println("The 1-3-sum is " + total);
    }
}