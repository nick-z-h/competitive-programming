import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        int N = kb.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        int C = 0;
        int x = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] + x <= T) {
                C++;
                x+=arr[i];
            }
        }
        System.out.println(C);
    }
}
