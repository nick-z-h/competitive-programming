import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int x = kb.nextInt();
        for(int i = 1; i<N; i++){
            int y = kb.nextInt();
            if(y<x){
                x = y;
            }
        }
        System.out.println(x);
    }
}