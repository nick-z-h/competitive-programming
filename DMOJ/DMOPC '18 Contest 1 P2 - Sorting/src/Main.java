import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int S = kb.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = kb.nextInt();
        }
        int[]sArr = new int[N];
        for(int i = 0; i<N; i++){
            sArr[i] = arr[i];
        }
        for(int i = 0; i<arr.length-S; i++){
            for(int j = 0; j<arr.length-S; j++){
                if(arr[j]>arr[j+S]){
                    int temp = arr[j];
                    arr[j] = arr[j+S];
                    arr[j+S] = temp;
                }
            }
        }
        Arrays.sort(sArr);
        boolean flag = true;
        for(int i = 0; i<N; i++) {
            if (sArr[i] != arr[i]) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}