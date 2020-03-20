import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int c = 0;
        for(int i = 0; i<N; i++){
            int R = kb.nextInt();
            int G = kb.nextInt();
            int B = kb.nextInt();
            if(R>= 240 && R<= 255 && G>= 0 && G<=200 && B>= 95 && B<=220){
                c++;
            }
        }
        System.out.println(c);
    }
}