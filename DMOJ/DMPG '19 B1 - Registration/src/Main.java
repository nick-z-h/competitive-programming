import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int c = 0;
        for(int i = 0; i<N; i++){
            int x = kb.nextInt();
            c += x;
        }
        if(200-c >= 0){
            System.out.println(200-c);
        } else{
            System.out.println("Over maximum capacity!");
        }
    }
}