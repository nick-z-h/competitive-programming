import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);

        if(N%2==0){
            for(int i = 0; i < N/2;i ++){
                System.out.print(arr[N/2-(i+1)] + " ");
                System.out.print(arr[N/2+i] + " ");
            }
        }else{
            System.out.print(arr[(N-1)/2] + " ");
            for(int i = 0; i < (N-1)/2;i++){
                System.out.print(arr[(N-1)/2+i+1] + " ");
                System.out.print(arr[(N-1)/2-i-1]+ " ");
            }
        }
    }
}
