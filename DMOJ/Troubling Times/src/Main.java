import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int d = kb.nextInt();
        int[] in = new int[n];
        int c = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            in[i] = kb.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(d/in[i] < c && d%in[i] == 0) {
                c = Math.abs(d/in[i]);
            }
        }
        if(c==Integer.MAX_VALUE) {
            System.out.println("This is not the best time for a trip.");
        } else {
            System.out.println(c);
        }
    }
}