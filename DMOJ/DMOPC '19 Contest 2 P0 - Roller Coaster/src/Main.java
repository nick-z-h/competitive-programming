import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int Min = kb.nextInt();
        int Max = kb.nextInt();
        int c = 0;
        for(int i = 0; i<N; i++){
            int q = kb.nextInt();
            if(q <= Max && q >= Min){
                c++;
            }
        }
        System.out.println(c);
    }
}