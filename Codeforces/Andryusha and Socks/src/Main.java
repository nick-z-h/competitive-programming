import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = 0;
        int c = 0;
        int[] a = new int[n];
        for(int i = 0 ; i < n*2; i++) {
            int t = kb.nextInt() -1;
            a[t]++;
            if(a[t] == 1) {
                c++;
            }
            if(a[t] == 2) {
                c--;
            }
            m = Math.max(m, c);
        }
        System.out.println(m);
    }
}