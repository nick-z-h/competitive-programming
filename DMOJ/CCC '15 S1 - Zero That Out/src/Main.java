import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Stack<Integer> a = new Stack<>();
        for(int i = 0; i < n; i++) {
            int t = kb.nextInt();
            if(t == 0) {
                a.pop();
            } else {
                a.push(t);
            }
        }
        int s = 0;
        while(!a.isEmpty()) {
            s += a.pop();
        }
        System.out.println(s);
    }
}