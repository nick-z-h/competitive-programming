import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] r = new int[N*2];
        for(int i = 0; i < N*2; i+=2) {
            r[i] = kb.nextInt();
            r[i+1] = kb.nextInt();
            if(r[i]!=r[i+1]) {
                System.out.println("rated");
                return;
            }
        }
        for(int i = 2; i < N*2; i+=2) {
            if(r[i] > r[i-1]) {
                System.out.println("unrated");
                return;
            }
        }
        System.out.println("maybe");
    }
}
