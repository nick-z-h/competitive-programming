import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++){
            arr[i] = kb.nextInt();
        }
        for(int i=0; i<N; i++){
            System.out.print(arr[i].toString() + " ");
        }
        System.out.println();
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    for(int g=0; g<N; g++){
                        System.out.print(arr[g].toString() + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}