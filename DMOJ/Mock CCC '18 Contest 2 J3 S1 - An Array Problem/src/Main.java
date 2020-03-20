import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        long[] a = new long[N+1];
        for(int i = 1; i<a.length; i++){
            a[i] = kb.nextInt();
        }
        Arrays.sort(a);
        long[] x = new long[N+1];
        for(int i = 1; i<x.length; i++){
            x[i] = x[i-1] + a[i];
        }
        System.out.println(Math.min(x[N-1],x[N]/2));
    }
}