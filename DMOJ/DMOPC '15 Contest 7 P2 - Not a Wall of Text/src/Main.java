import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] words = kb.nextLine().split("\\s");
        System.out.println(words.length);
    }
}