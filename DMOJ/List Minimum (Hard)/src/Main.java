import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        Integer[] a = new Integer[N];
        for(int i=0; i<N; i++){
            a[i]=kb.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<N; i++){
            System.out.println(a[i]);
        }
    }
}